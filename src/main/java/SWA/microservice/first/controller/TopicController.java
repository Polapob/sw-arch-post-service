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
import SWA.microservice.first.dto.topic.CreateTopicRequestDTO;
import SWA.microservice.first.dto.topic.CreateTopicResponseDTO;
import SWA.microservice.first.dto.topic.GetTopicResponseDTO;
import SWA.microservice.first.dto.topic.GetTopicsResponseDTO;

@RestController
public class TopicController {

	@GetMapping("/topics")
	public GetTopicsResponseDTO getTopics() throws Exception {
		try {
			MongoClient connection = MongoClientConnection.createMongoClient();
			MongoDatabase database = connection.getDatabase("local");
			MongoCollection<Document> collection = database.getCollection("topics");

			List<Bson> lookup = new ArrayList<Bson>(
					List.of(Aggregates.lookup("forums", "forumId", "id", "forum"), Aggregates.unwind("$forum")));

			List<Document> topics = collection.aggregate(lookup).into(new ArrayList<>());
			GetTopicsResponseDTO response = new GetTopicsResponseDTO(topics, true);
			return response;

		} catch (Exception e) {
			throw e;
		}
	}

	@PostMapping("/topics")
	public CreateTopicResponseDTO createTopic(@RequestBody CreateTopicRequestDTO request) throws Exception {
		try {
			MongoClient connection = MongoClientConnection.createMongoClient();
			MongoDatabase database = connection.getDatabase("local");
			MongoCollection<Document> topicCollection = database.getCollection("topics");
			MongoCollection<Document> forumCollection = database.getCollection("forums");
			String subjectId = request.getSubjectId();
			Integer year = request.getYear();
			Integer section = request.getSection();
			Integer semester = request.getSemester();
			String description = request.getDescription();
			String creatorId = request.getCreatorId();

			Document query = new Document("subjectId", request.getSubjectId()).append("year", request.getYear())
					.append("section", request.getSection()).append("semester", request.getSemester());

			Document forum = forumCollection.find(query).first();

			if (forum == null) {
				Document newForum = new Document("_id", new ObjectId());
				newForum.append("id", UUID.randomUUID().toString());
				newForum.append("subjectId", subjectId);
				newForum.append("year", year);
				newForum.append("section", section);
				newForum.append("semester", semester);
				forumCollection.insertOne(newForum);
				forum = newForum;
			}

			Document topic = new Document("_id", new ObjectId());

			UUID uuid = UUID.randomUUID();

			topic.append("id", uuid.toString());
			topic.append("description", description);
			topic.append("topicCreator", creatorId);
			topic.append("forumId", forum.getString("id"));
			topic.append("createAt", new Date());

			topicCollection.insertOne(topic);

			CreateTopicResponseDTO response = new CreateTopicResponseDTO(topic, true);

			return response;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	@GetMapping("/topics/{id}")
	public GetTopicResponseDTO getTopicById(@PathVariable("id") String id) throws Exception, ClassNotFoundException {
		try {

			MongoClient connection = MongoClientConnection.createMongoClient();
			MongoDatabase database = connection.getDatabase("local");
			MongoCollection<Document> topicCollection = database.getCollection("topics");
			MongoCollection<Document> forumCollection = database.getCollection("forums");
			Bson filter = Filters.eq("id", id);

			Document topic = topicCollection.find(filter).first();
			String topicCreator = topic.getString("topicCreator");
			String description = topic.getString("description");
			Date date = topic.getDate("createAt");

			Document query = new Document("id", topic.getString("forumId"));
			Document _forum = forumCollection.find(query).first();

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

	@GetMapping("/health-check")
	public boolean healthCheck() {
		return true;
	}
}
