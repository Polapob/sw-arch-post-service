package SWA.microservice.first.dto.topic;

import java.util.List;

import org.bson.Document;

public class GetTopicsResponseDTO {
	private List<Document> topics;
	private boolean isSuccess;

	public GetTopicsResponseDTO(List<Document> topics, boolean isSuccess) {
		this.topics = topics;
		this.isSuccess = isSuccess;
	}

	public List<Document> getTopics() {
		return topics;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	@Override
	public String toString() {
		return "GetTopicsResponseDTO [topics=" + topics + ", isSuccess=" + isSuccess + "]";
	}

}
