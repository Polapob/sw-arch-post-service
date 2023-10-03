
package SWA.microservice.first.repository;

import java.util.List;

import org.bson.Document;

import SWA.microservice.first.domain.Forum;
import SWA.microservice.first.domain.Topic;

public interface ITopicRepository {
	public List<Document> getTopics() throws Exception;
	public Document createTopic(Topic topic) throws Exception;
	public Document createForum(Forum forum) throws Exception;
	Document findForum(Forum forum) throws Exception;
	Document getTopicById(String id) throws Exception;
	Document getForumById(String id) throws Exception;
}
