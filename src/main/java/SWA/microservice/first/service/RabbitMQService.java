package SWA.microservice.first.service;

import org.springframework.stereotype.Service;
import org.springframework.util.SerializationUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.ConnectionFactory;

import SWA.microservice.first.event.BaseEvent;

@Service
public class RabbitMQService implements IRabbitMQService {
	public void publishEvent(String exchangeName,BaseEvent event) throws Exception {
		var factory = new ConnectionFactory();
		factory.setUri("amqp://guest:guest@rabbitMQ:5672");
		
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
