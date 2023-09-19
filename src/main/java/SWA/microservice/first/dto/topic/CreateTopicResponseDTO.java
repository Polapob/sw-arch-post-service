package SWA.microservice.first.dto.topic;

import org.bson.Document;

public class CreateTopicResponseDTO {
	private Document topic;
	private boolean isSuccess;

	public CreateTopicResponseDTO(Document topic, boolean isSuccess) {
		this.isSuccess = isSuccess;
		this.topic = topic;
	}

	public Document getTopic() {
		return topic;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	@Override
	public String toString() {
		return "CreateTopicResponseDTO [isSuccess=" + isSuccess + ", topic=" + topic + "]";
	}

}
