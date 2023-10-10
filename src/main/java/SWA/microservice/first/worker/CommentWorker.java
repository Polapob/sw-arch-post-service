package SWA.microservice.first.worker;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.util.SerializationUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import SWA.microservice.first.dto.comment.CreateCommentRequestDTO;
import SWA.microservice.first.event.CreateCommentEvent;

public class CommentWorker {
	private static final String EXCHANGE_NAME = "comment_worker";
	private static final String[] topics = { "post.comment.create" };
	private static final List<String> BINDING_KEYS = new ArrayList<>(Arrays.asList(topics));
	private static final String CREATE_COMMENT_URL = "http://localhost:8080/comments";

	public static void main(String[] argv) throws Exception {
		var factory = new ConnectionFactory();
		factory.setHost("localhost");
		var connection = factory.newConnection();
		var channel = connection.createChannel();

		channel.exchangeDeclare(EXCHANGE_NAME, "topic");

		var queueName = channel.queueDeclare().getQueue();

		for (String key : BINDING_KEYS) {
			channel.queueBind(queueName, EXCHANGE_NAME, key);
		}

		System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

		DeliverCallback deliverCallback = (consumerTag, delivery) -> {
			@SuppressWarnings("deprecation")
			CreateCommentEvent message = (CreateCommentEvent) SerializationUtils.deserialize(delivery.getBody());
			System.out.println(" [x] Received '" + message + "'"); 
			var dto = new CreateCommentRequestDTO();
			dto.topicId = message.topicId;
			dto.description = message.description;
			dto.authorId = message.authorId;
			try {
				createComment(dto);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		channel.basicConsume(queueName, true, deliverCallback, consumerTag -> {
		});
	}

	private static boolean createComment(CreateCommentRequestDTO dto) throws Exception {
		var body = new HashMap<String, String>() {
			private static final long serialVersionUID = -3474031491790826608L;
			{
				put("topicId", dto.topicId);
				put("description", dto.description);
				put("authorId", dto.authorId);
			}
		};
		
        var objectMapper = new ObjectMapper();
        String requestBody = objectMapper
                .writeValueAsString(body);
		
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(CREATE_COMMENT_URL))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
		return true;
	}
}
