package SWA.microservice.first.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import SWA.microservice.first.domain.Comment;
import SWA.microservice.first.dto.comment.CreateCommentRequestDTO;
import SWA.microservice.first.dto.comment.CreateCommentResponseDTO;
import SWA.microservice.first.dto.comment.GetCommentByIdResponseDTO;
import SWA.microservice.first.dto.comment.GetCommentsByTopicIdResponseDTO;
import SWA.microservice.first.dto.comment.PublishCommentEventResponseDTO;
import SWA.microservice.first.service.ICommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	private ICommentService commentService;
	
	@PostMapping("")
	public CreateCommentResponseDTO createComment(@RequestBody CreateCommentRequestDTO request) throws Exception {
		var comment = new Comment(request.topicId,request.description,request.authorId,new Date());
		var commentDTO = commentService.createComment(comment);
		var response = new CreateCommentResponseDTO(commentDTO,true);
		return response;
	}
	
	@GetMapping("{id}") 
	public GetCommentByIdResponseDTO getCommentById(@PathVariable String id) throws Exception {
		var commentDTO = commentService.getCommentById(id);
		var response = new GetCommentByIdResponseDTO(commentDTO,true);
		return response;
	}
	
	@GetMapping("") 
	public GetCommentsByTopicIdResponseDTO getCommentsByTopicId(@RequestParam(required = true) String topicId) throws Exception {
		var commentDTOs = commentService.getCommentsByTopicId(topicId);
		var response = new GetCommentsByTopicIdResponseDTO(commentDTOs,true);
		return response;
	}
	
	@PostMapping("/publishEvent")
	public PublishCommentEventResponseDTO publishCommentEvent() throws Exception {
		var isSuccess = commentService.publishCreateCommentMessage();
		var response = new PublishCommentEventResponseDTO(isSuccess);
		return response;
	}
}
