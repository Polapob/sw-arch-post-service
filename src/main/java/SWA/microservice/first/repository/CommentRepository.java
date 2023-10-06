package SWA.microservice.first.repository;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;

import SWA.microservice.first.Driven.MongoDB.IMongoClientConnection;
import SWA.microservice.first.domain.Comment;

@Repository
public class CommentRepository implements ICommentRepository {
	@Autowired
	private IMongoClientConnection mongoClient;

	public CommentRepository(IMongoClientConnection mongoClient) {
		this.mongoClient = mongoClient;
	}

	public Document createComment(Comment comment) throws Exception {
		var collection = createCollection();
		try {

			var document = new Document("id", comment.getId()).append("topicId", comment.getTopicId())
					.append("description", comment.getDescription()).append("authorId", comment.getAuthorId())
					.append("createAt", comment.getCreateAt());

			collection.insertOne(document);
			return document;
		} catch (MongoException ex) {
			throw ex;
		}

	}

	public Document getCommentById(String id) throws Exception {
		var collection = createCollection();
		var document = new Document("id", id);
		var comment = collection.find(document).first();
		return comment;
	}

	public List<Document> getCommentListByTopicId(String id) throws Exception {
		var collection = createCollection();
		var document = new Document("topicId", id);
		var comments = collection.find(document).into(new ArrayList<>());
		return comments;
	}

	private MongoCollection<Document> createCollection() throws Exception {
		var client = mongoClient.createMongoClient();
		var db = client.getDatabase("local");
		var collection = db.getCollection("comments");
		return collection;
	}
}
