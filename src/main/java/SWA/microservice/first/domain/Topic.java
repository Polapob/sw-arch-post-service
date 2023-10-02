package SWA.microservice.first.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Topic {
	private String id;
	private String description;
	private Forum forum;
	private String creatorId;
	private List<Comment> comments;
	private Date createAt;

	public Topic(String id, String description, Forum forum, String creatorId, List<Comment> comments, Date createAt) {
		this.id = id;
		this.description = description;
		this.forum = forum;
		this.creatorId = creatorId;
		this.comments = comments;
		this.createAt = createAt;
	}
	
	public Topic(String description, Forum forum, String creatorId) {
		this.id = UUID.randomUUID().toString();
		this.description = description;
		this.forum = forum;
		this.creatorId = creatorId;
		this.createAt = new Date();
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Forum getForum() {
		return forum;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public Date getCreateAt() {
		return createAt;
	}
	
	public void setForum(Forum forum) {
		this.forum = forum;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", description=" + description + ", forum=" + forum + ", creatorId=" + creatorId
				+ ", comments=" + comments + ", createAt=" + createAt + "]";
	}

}
