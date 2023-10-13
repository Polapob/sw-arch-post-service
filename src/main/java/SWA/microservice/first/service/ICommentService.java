package SWA.microservice.first.service;

import java.util.List;

import SWA.microservice.first.domain.Comment;
import SWA.microservice.first.dto.comment.CommentDTO;

public interface ICommentService {
	CommentDTO createComment(Comment comment) throws Exception;
	List<CommentDTO> getCommentsByTopicId(String id) throws Exception;
	CommentDTO getCommentById(String id) throws Exception;
	boolean publishCreateCommentMessage() throws Exception;
}
