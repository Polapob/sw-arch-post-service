package SWA.microservice.first.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import SWA.microservice.first.domain.Comment;
import SWA.microservice.first.domain.Forum;
import SWA.microservice.first.domain.Topic;
import SWA.microservice.first.dto.topic.CreateTopicResponseDTO;
import SWA.microservice.first.dto.topic.GetTopicResponseDTO;
import SWA.microservice.first.dto.topic.GetTopicsResponseDTO;
import SWA.microservice.first.repository.ITopicRepository;

public class TopicService implements ITopicService {

	private ITopicRepository topicRepository;

	public GetTopicsResponseDTO getTopics() throws Exception {
		try {
			var topics = topicRepository.getTopics();
			GetTopicsResponseDTO response = new GetTopicsResponseDTO(topics, true);

			return response;

		} catch (Exception e) {
			throw e;
		}
	}

	public CreateTopicResponseDTO createTopic(Topic topic) throws Exception {

		try {
			var _forum = topic.getForum();

			var forum = topicRepository.findForum(_forum);

			if (forum == null) {
				var newForum = topicRepository.createForum(_forum);
				forum = newForum;
			}

			var _topic = topicRepository.createTopic(topic);

			CreateTopicResponseDTO response = new CreateTopicResponseDTO(_topic, true);

			return response;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	@GetMapping("/topics/{id}")
	public GetTopicResponseDTO getTopicById(String id) throws Exception {
		try {

			var topic = topicRepository.getTopicById(id);

			String topicCreator = topic.getString("topicCreator");
			String description = topic.getString("description");
			Date date = topic.getDate("createAt");
			var forumId = topic.getString("forumId");

			var _forum = topicRepository.getForumById(forumId);

			if (_forum == null) {
				throw new ClassNotFoundException();
			}

			Forum forum = new Forum(_forum.getString("id"), _forum.getString("subjectId"), _forum.getInteger("year"),
					_forum.getInteger("semester"), _forum.getInteger("section"));

			List<Comment> comments = new ArrayList<Comment>();

			GetTopicResponseDTO response = new GetTopicResponseDTO(id.toString(), forum, topicCreator, description,
					date, comments);

			return response;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

}
