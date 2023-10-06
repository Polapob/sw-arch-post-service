package SWA.microservice.first.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CreateCommentFailedException extends RuntimeException {
	private static final long serialVersionUID = 5945224407848759732L;

	public CreateCommentFailedException() {
		super();
	}

	public CreateCommentFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public CreateCommentFailedException(String message) {
		super(message);
	}

	public CreateCommentFailedException(Throwable cause) {
		super(cause);
	}
}
