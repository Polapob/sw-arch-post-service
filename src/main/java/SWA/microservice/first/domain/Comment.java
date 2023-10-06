package SWA.microservice.first.domain;

import java.util.Date;
import java.util.UUID;

public class Comment {
	private String id;
	private String topicId;
	private String description;
	private String authorId;
	private Date createAt;
	
	public Comment(String topicId, String description, String authorId, Date createAt) {
		this.id = UUID.randomUUID().toString();
		this.topicId = topicId;
		this.description = description;
		this.authorId = authorId;
		this.createAt = createAt;
	}
	public String getId() {
		return id;
	}
	public String getTopicId() {
		return topicId;
	}
	public String getDescription() {
		return description;
	}
	public String getAuthorId() {
		return authorId;
	}
	public Date getCreateAt() {
		return createAt;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", topic=" + topicId + ", description=" + description + ", commenterId="
				+ authorId + ", createAt=" + createAt + "]";
	}	
}
