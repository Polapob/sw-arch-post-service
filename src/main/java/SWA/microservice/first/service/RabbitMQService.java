package SWA.microservice.first.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.SerializationUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.ConnectionFactory;

import SWA.microservice.first.event.BaseEvent;

@Service
public class RabbitMQService implements IRabbitMQService {
	
	@Value("${broker.uri.path}")
	private static String rabbitMqUri;
	
	public void publishEvent(String exchangeName,BaseEvent event) throws Exception {
		var factory = new ConnectionFactory();
		factory.setUri(rabbitMqUri);
		
		try (var connection = factory.newConnection()){
			var channel = connection.createChannel();
			
			channel.exchangeDeclare(exchangeName, "topic");
			
			var routingKey = "post.comment.create";
			var mapper = new ObjectMapper();
			var message = mapper.writeValueAsBytes(event);
			
			channel.basicPublish(exchangeName, routingKey, null, message);
			System.out.println(" [x] Sent '" + routingKey + "':'" + message + "'");
		}
	}
}
