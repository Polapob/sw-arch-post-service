package SWA.microservice.first.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Aggregates;
import SWA.microservice.first.Driven.MongoDB.MongoClientConnection;
import SWA.microservice.first.domain.Comment;
import SWA.microservice.first.domain.Forum;
import SWA.microservice.first.domain.Topic;
import SWA.microservice.first.dto.topic.CreateTopicRequestDTO;
import SWA.microservice.first.dto.topic.CreateTopicResponseDTO;
import SWA.microservice.first.dto.topic.GetTopicResponseDTO;
import SWA.microservice.first.dto.topic.GetTopicsResponseDTO;
import SWA.microservice.first.service.ITopicService;

@RestController
public class TopicController {
	
	private ITopicService topicService;
	
	@GetMapping("/topics")
	public GetTopicsResponseDTO getTopics() throws Exception {
		return topicService.getTopics();
	}

	@PostMapping("/topics")
	public CreateTopicResponseDTO createTopic(@RequestBody CreateTopicRequestDTO request) throws Exception {
		var forum = new Forum(request.getSubjectId(), request.getYear(), request.getSemester(), request.getSection());
		var topic = new Topic(request.getDescription(), forum, request.getCreatorId());
		return topicService.createTopic(topic);
	}

	@GetMapping("/topics/{id}")
	public GetTopicResponseDTO getTopicById(@PathVariable("id") String id) throws Exception {
		return topicService.getTopicById(id);
	}

	@GetMapping("/health-check")
	public boolean healthCheck() {
		return true;
	}
}
