package SWA.microservice.first.repository;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;

import SWA.microservice.first.Driven.MongoDB.IMongoClientConnection;
import SWA.microservice.first.Driven.MongoDB.MongoClientConnection;
import SWA.microservice.first.domain.Forum;
import SWA.microservice.first.domain.Topic;

@Repository
public class TopicRepository implements ITopicRepository {
	@Autowired
	private IMongoClientConnection mongoClient;

	@Override
	public List<Document> getTopics() throws Exception {
		try {
			var topicCollection = getCollection("topics");

			List<Bson> lookup = new ArrayList<Bson>(
					List.of(Aggregates.lookup("forums", "forumId", "id", "forum"), Aggregates.unwind("$forum")));

			List<Document> topics = topicCollection.aggregate(lookup).into(new ArrayList<>());
			return topics;

		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Document findForum(Forum forum) throws Exception {
		var forumCollection = getCollection("forums");

		Document query = new Document("subjectId", forum.getSubjectId()).append("year", forum.getYear())
				.append("section", forum.getSection()).append("semester", forum.getSemester());

		Document _forum = forumCollection.find(query).first();
		return _forum;
	}

	@Override
	public Document getTopicById(String id) throws Exception {
		var topicCollection = getCollection("topics");

		Bson filter = Filters.eq("id", id);
		Document topic = topicCollection.find(filter).first();
		return topic;
	}

	@Override
	public Document createTopic(Topic topic) throws Exception {
		var topicCollection = getCollection("topics");

		Document _topic = new Document();
		_topic.append("id", topic.getId());
		_topic.append("description", topic.getDescription());
		_topic.append("topicCreator", topic.getCreatorId());
		_topic.append("forumId", topic.getForum().getId());
		_topic.append("createAt", topic.getCreateAt());

		topicCollection.insertOne(_topic);

		return _topic;
	}

	@Override
	public Document createForum(Forum forum) throws Exception {
		var forumCollection = getCollection("forums");

		Document _forum = new Document();
		_forum.append("id", forum.getId());
		_forum.append("subjectId", forum.getSubjectId());
		_forum.append("year", forum.getYear());
		_forum.append("section", forum.getSection());
		_forum.append("semester", forum.getSemester());

		forumCollection.insertOne(_forum);

		return _forum;
	}

	@Override
	public Document getForumById(String id) throws Exception {
		var forumCollection = getCollection("forums");
		Document query = new Document("id", id);
		Document _forum = forumCollection.find(query).first();

		return _forum;
	}

	private MongoCollection<Document> getCollection(String collectionName) throws Exception {
		MongoClient connection = mongoClient.createMongoClient();
		MongoDatabase database = connection.getDatabase("local");
		MongoCollection<Document> collection = database.getCollection(collectionName);

		return collection;
	}

}
