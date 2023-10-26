package SWA.microservice.first.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ValidateSectionFailedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValidateSectionFailedException(String message) {
		super(message);
	}
}
