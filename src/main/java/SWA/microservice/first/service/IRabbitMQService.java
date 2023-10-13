package SWA.microservice.first.service;

import SWA.microservice.first.event.BaseEvent;

public interface IRabbitMQService {
	void publishEvent(String exchangeName,BaseEvent event) throws Exception;
}
