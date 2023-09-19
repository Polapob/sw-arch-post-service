package SWA.microservice.first.dto.topic;

import java.util.Date;
import java.util.List;

import org.bson.Document;

import SWA.microservice.first.domain.Comment;
import SWA.microservice.first.domain.Forum;

public class GetTopicResponseDTO {
	private String id;
	private Forum forum;
	private String topicCreatorId;
	private String description;
	private Date createAt;
	private List<Comment> comments;

	public GetTopicResponseDTO(String id, Forum forum, String topicCreatorId, String description, Date createAt,
			List<Comment> comments) {
		this.id = id;
		this.forum = forum;
		this.topicCreatorId = topicCreatorId;
		this.description = description;
		this.createAt = createAt;
		this.comments = comments;
	}

	public String getId() {
		return id;
	}

	public Forum getForum() {
		return forum;
	}

	public String getTopicCreatorId() {
		return topicCreatorId;
	}

	public String getDescription() {
		return description;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public List<Comment> getComments() {
		return comments;
	}

	@Override
	public String toString() {
		return "GetTopicResponseDTO [id=" + id + ", forum=" + forum + ", topicCreatorId=" + topicCreatorId
				+ ", description=" + description + ", createAt=" + createAt + ", comments=" + comments + "]";
	}

}
