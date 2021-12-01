package com.example.commentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.commentservice.model.Comments;
import com.example.commentservice.service.CommentService;


@RestController
@RequestMapping("/commentservice")
public class CommentController {
	
	@Autowired
	CommentService service;
	
	@GetMapping("/comment/all")
	public List<Comments> getAll(){
		return service.getAllComments();
	}
		
	@PostMapping("/comment/add")
	public Comments addPost(@RequestBody Comments post) {
		return service.addComment(post);
	}
	
	@DeleteMapping("/comment/delete/{cid}")
	public String deleteComment(@PathVariable("cid") Integer cid) {
		return service.deleteComment(cid);
		
	}
	
	@PutMapping("/comments/update")
	public Comments updateComment(@RequestBody Comments comment) {
		return service.addComment(comment);
	}
	
	@GetMapping("/comments/search/{commenter}")
	public List<Comments> getAllByCommenter(@PathVariable("commenter") String commenter){
		return service.searchCommentsByCommenter(commenter);
	}
	
	
	@GetMapping("/posts/comments/search/{pid}")
	public List<Comments> getCommentsByPid(@PathVariable("pid") Integer pid){
		return service.searchCommentsByPid(pid);
	}
	

}
