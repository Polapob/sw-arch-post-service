package SWA.microservice.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SWA.microservice.first.domain.Forum;
import SWA.microservice.first.domain.Topic;
import SWA.microservice.first.dto.topic.CreateTopicRequestDTO;
import SWA.microservice.first.dto.topic.CreateTopicResponseDTO;
import SWA.microservice.first.dto.topic.GetTopicResponseDTO;
import SWA.microservice.first.dto.topic.GetTopicsResponseDTO;
import SWA.microservice.first.service.ITopicService;

@RestController
public class TopicController {
	
	@Autowired
	private ITopicService topicService;
	
	@GetMapping("/topics")
	public GetTopicsResponseDTO getTopics() throws Exception {
		var topics = topicService.getTopics();
		GetTopicsResponseDTO response = new GetTopicsResponseDTO(topics, true);
		return response;
	}

	@PostMapping("/topics")
	public CreateTopicResponseDTO createTopic(@RequestBody CreateTopicRequestDTO request) throws Exception {
		var forum = new Forum(request.getSubjectId(), request.getYear(), request.getSemester(), request.getSection());
		var _topic = new Topic(request.getDescription(), forum, request.getCreatorId());
		
		var topic = topicService.createTopic(_topic);
		var response = new CreateTopicResponseDTO(topic,true);
		return response;
	}

	@GetMapping("/topics/{id}")
	public GetTopicResponseDTO getTopicById(@PathVariable("id") String id) throws Exception {
		var topic = topicService.getTopicById(id);
		return topic;
	}

	@GetMapping("/health-check")
	public boolean healthCheck() {
		return true;
	}
}
