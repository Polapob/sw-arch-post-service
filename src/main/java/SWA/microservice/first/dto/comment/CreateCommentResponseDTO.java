package SWA.microservice.first.dto.comment;

public class CreateCommentResponseDTO {
	public CommentDTO comment;
	public boolean isSuccess;
	
	public CreateCommentResponseDTO(CommentDTO comment, boolean isSuccess) {
		this.comment = comment;
		this.isSuccess = isSuccess;
	}
}
