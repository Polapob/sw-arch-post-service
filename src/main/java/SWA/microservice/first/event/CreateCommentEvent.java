package SWA.microservice.first.event;

import java.util.Date;

import org.json.JSONObject;

public class CreateCommentEvent extends BaseEvent {

	private static final long serialVersionUID = -7134290599880890319L;
	public String correlationId;
	public String description;
	public String authorId;
	public String topicId;
	
	public CreateCommentEvent(String correlationId, String description, String authorId,String topicId) {
		super(new Date(),authorId,new JSONObject());
		this.correlationId = correlationId;
		this.description = description;
		this.authorId = authorId;
		this.topicId = topicId;
		this.data.put("correlationId", correlationId);
		this.data.put("description", description);
		this.data.put("authorId", authorId);
		this.data.put("topicId",topicId);
	}
	
	public CreateCommentEvent(Date publishAt, String publishBy, JSONObject data) {
		super(publishAt, publishBy, data);
	}

	@Override
	public String toString() {
		return "CreateCommentEvent [correlationId=" + correlationId + ", description=" + description + ", authorId="
				+ authorId + ", topicId=" + topicId + "]";
	}
	
}
