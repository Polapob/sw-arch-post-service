package SWA.microservice.first.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SWA.microservice.first.domain.Comment;
import SWA.microservice.first.domain.Forum;
import SWA.microservice.first.domain.Topic;
import SWA.microservice.first.dto.topic.GetTopicResponseDTO;
import SWA.microservice.first.exception.SubjectNotFoundException;
import SWA.microservice.first.external.service.ISubjectService;
import SWA.microservice.first.repository.ITopicRepository;
import SWA.microservice.first.ValidateSubjectIdRequest;

@Service
public class TopicService implements ITopicService {

	@Autowired
	private ITopicRepository topicRepository;
	@Autowired
	private ISubjectService subjectService;

	public List<Document> getTopics() throws Exception {
		try {
			var topics = topicRepository.getTopics();

			return topics;

		} catch (Exception e) {
			throw e;
		}
	}

	public Document createTopic(Topic topic) throws Exception {

		try {
			var _forum = topic.getForum();
			

			var isValid = subjectService.validateSubject((long) 1);
			
	
			if (!isValid) {
				throw new SubjectNotFoundException("Invalid subject create topic");
			}

			var forum = topicRepository.findForum(_forum);

			if (forum == null) {
				var newForum = topicRepository.createForum(_forum);
				forum = newForum;
			}
			
			var id = forum.getString("id");
			var year = forum.getInteger("year");
			var semester = forum.getInteger("semester");
			var section = forum.getInteger("section");
			var subjectId = forum.getString("subjectId");
			
			_forum = new Forum(id, subjectId, year, semester, section);
			topic.setForum(_forum);

			
			var _topic = topicRepository.createTopic(topic);

			return _topic;

		} catch (Exception e) {
			throw e;
		}
	}

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
			throw e;
		}
	}
	
	public boolean isTopicExist(String topicId) throws Exception {
		var isTopicExist = getTopicById(topicId).getId() != null;
		return isTopicExist;
	}

}
