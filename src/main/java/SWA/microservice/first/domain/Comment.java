package SWA.microservice.first.domain;

import java.util.Date;

public class Comment {
	private String id;
	private String topicId;
	private Forum forum;
	private String description;
	private String commenterId;
	private Date createAt;

	public Comment(String id, String topicId, Forum forum, String description, String commenterId, Date createAt) {
		this.topicId = topicId;
		this.forum = forum;
		this.description = description;
		this.commenterId = commenterId;
		this.createAt = createAt;
	}

	public String getId() {
		return id;
	}

	public String getTopicId() {
		return topicId;
	}

	public Forum getForum() {
		return forum;
	}

	public String getDescription() {
		return description;
	}

	public String getCommenterId() {
		return commenterId;
	}

	public Date getCreateAt() {
		return createAt;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", topicId=" + topicId + ", forum=" + forum + ", description=" + description
				+ ", commenterId=" + commenterId + ", createAt=" + createAt + "]";
	}

}
