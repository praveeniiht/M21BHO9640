package com.example.postservice.controller;

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

import com.example.postservice.model.CommentsDto;
import com.example.postservice.model.Posts;
import com.example.postservice.service.PostService;

@RestController
@RequestMapping("/postservice")
public class PostController {
	
	@Autowired
	PostService service;
	
	@GetMapping("/post/all")
	public List<Posts> getAll(){
		return service.getAllPosts();
	}
	
	@PostMapping("/post/add")
	public Posts addPost(@RequestBody Posts post) {
		return service.addPost(post);
	}
	
	@DeleteMapping("/post/delete/{pid}")
	public String deletePost(@PathVariable("pid") String pid) {
		return service.deletePost(pid);
		
	}
	
	@PutMapping("/post/update")
	public Posts updatePost(@RequestBody Posts post) {
		return service.addPost(post);
	}
	
	@GetMapping("/post/search/{title}")
	public List<Posts> searchByTitle(@PathVariable("title")String title){
		return service.searchPostsByTitle(title);
		
	}
	@GetMapping("/posts/search/{author}")
	public List<Posts> searchByAuthor(@PathVariable("author")String author){
		return service.searchPostsByAuthor(author);
		
	}
	
	@GetMapping("/posts/comments/{pid}")
	public List<CommentsDto> searchCommentsByPostId(@PathVariable("pid")String pid){
		return service.getCommentsByPostId(pid);
	}
	
}
	