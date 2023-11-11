package SWA.microservice.first.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import SWA.microservice.first.exception.CreateCommentFailedException;
import SWA.microservice.first.exception.GetCommentsByTopicIdFailedException;
import SWA.microservice.first.exception.SubjectNotFoundException;
import SWA.microservice.first.exception.ValidateSectionFailedException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({CreateCommentFailedException.class})
    public ResponseEntity<Object> handleStudentNotFoundException(CreateCommentFailedException exception) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(exception.getMessage());
    }
    @ExceptionHandler({GetCommentsByTopicIdFailedException.class})
    public ResponseEntity<Object> handleStudentAlreadyExistsException(GetCommentsByTopicIdFailedException exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exception.getMessage());
    }
    
    @ExceptionHandler({SubjectNotFoundException.class})
    public ResponseEntity<Object> handleStudentAlreadyExistsException(SubjectNotFoundException exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exception.getMessage());
    }
    
    @ExceptionHandler({ValidateSectionFailedException.class})
    public ResponseEntity<Object> handleStudentAlreadyExistsException(ValidateSectionFailedException exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exception.getMessage());
    }
    
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<Object> handleRuntimeException(RuntimeException exception) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(exception.getMessage());
    }
}