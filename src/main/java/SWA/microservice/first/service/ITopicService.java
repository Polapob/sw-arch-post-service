package SWA.microservice.first.service;

import java.util.List;

import org.bson.Document;

import SWA.microservice.first.domain.Topic;
import SWA.microservice.first.dto.topic.GetTopicResponseDTO;

public interface ITopicService {
	public List<Document> getTopics() throws Exception;
	public Document createTopic(Topic topic) throws Exception;
	public GetTopicResponseDTO getTopicById(String id) throws Exception;
	public boolean isTopicExist(String topicId) throws Exception;
}
