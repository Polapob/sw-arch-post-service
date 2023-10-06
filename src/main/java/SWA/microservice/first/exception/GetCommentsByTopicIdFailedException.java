package SWA.microservice.first.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class GetCommentsByTopicIdFailedException extends RuntimeException {

	private static final long serialVersionUID = -7975956497907968163L;

	public GetCommentsByTopicIdFailedException() {
		super();
	}

	public GetCommentsByTopicIdFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public GetCommentsByTopicIdFailedException(String message) {
		super(message);
	}

	public GetCommentsByTopicIdFailedException(Throwable cause) {
		super(cause);
	}
}
