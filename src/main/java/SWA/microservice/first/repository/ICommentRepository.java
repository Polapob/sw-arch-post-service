package SWA.microservice.first.repository;

import java.util.List;

import org.bson.Document;

import SWA.microservice.first.domain.Comment;

public interface ICommentRepository {
	Document createComment(Comment comment) throws Exception;

	Document getCommentById(String id) throws Exception;

	List<Document> getCommentListByTopicId(String id) throws Exception;
}
