package SWA.microservice.first.dto.comment;

import java.util.List;

public class GetCommentsByTopicIdResponseDTO {
	public List<CommentDTO> comments;
	public boolean isSuccess;
	
	public GetCommentsByTopicIdResponseDTO(List<CommentDTO> comments, boolean isSuccess) {
		this.comments = comments;
		this.isSuccess = isSuccess;
	}
}
