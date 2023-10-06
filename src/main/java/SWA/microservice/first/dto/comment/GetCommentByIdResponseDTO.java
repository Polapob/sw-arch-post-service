package SWA.microservice.first.dto.comment;

public class GetCommentByIdResponseDTO {
	public CommentDTO comment;
	public boolean isSuccess;
	
	public GetCommentByIdResponseDTO(CommentDTO comment, boolean isSuccess) {
		this.comment = comment;
		this.isSuccess = isSuccess;
	}
}
