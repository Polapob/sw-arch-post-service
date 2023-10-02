package SWA.microservice.first.service;

import SWA.microservice.first.domain.Topic;
import SWA.microservice.first.dto.topic.CreateTopicResponseDTO;
import SWA.microservice.first.dto.topic.GetTopicResponseDTO;
import SWA.microservice.first.dto.topic.GetTopicsResponseDTO;

public interface ITopicService {
	public GetTopicsResponseDTO getTopics() throws Exception;
	public CreateTopicResponseDTO createTopic(Topic topic) throws Exception;
	public GetTopicResponseDTO getTopicById(String id) throws Exception;
}
