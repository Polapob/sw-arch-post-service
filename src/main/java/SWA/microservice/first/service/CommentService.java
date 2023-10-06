package SWA.microservice.first.service;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SWA.microservice.first.domain.Comment;
import SWA.microservice.first.dto.comment.CommentDTO;
import SWA.microservice.first.exception.CreateCommentFailedException;
import SWA.microservice.first.exception.GetCommentsByTopicIdFailedException;
import SWA.microservice.first.repository.ICommentRepository;

@Service
public class CommentService implements ICommentService {
	@Autowired
	private ICommentRepository commentRepository;
	@Autowired
	private ITopicService topicService;

	public CommentDTO createComment(Comment comment) throws Exception {
		// TODO Auto-generated method stub

		if (!isTopicExist(comment.getTopicId())) {
			throw new CreateCommentFailedException("the specify topic doesn't exist");
		}

		var _comment = commentRepository.createComment(comment);
		return mapDocumentToDTO(_comment);
	}

	private boolean isTopicExist(String id) throws Exception {
		return topicService.isTopicExist(id);
	}

	public List<CommentDTO> getCommentsByTopicId(String id) throws Exception {
		if (!isTopicExist(id)) {
			throw new GetCommentsByTopicIdFailedException("the specify topic doesn't exist");
		}
		var comments = commentRepository.getCommentListByTopicId(id);
		return comments.stream().map(c -> mapDocumentToDTO(c)).toList();
	}

	public CommentDTO getCommentById(String id) throws Exception {
		var comment = commentRepository.getCommentById(id);
		return mapDocumentToDTO(comment);
	}
	
	private CommentDTO mapDocumentToDTO(Document document) {
		var dto = new CommentDTO();
		dto.id = document.getString("id");
		dto.authorId = document.getString("authorId");
		dto.createAt = document.getDate("createAt");
		dto.description = document.getString("description");
		dto.topicId = document.getString("topicId");
		
		return dto;
	}
}
