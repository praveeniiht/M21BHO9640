package com.example.eureka.noteseurekaclient.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.example.eureka.noteseurekaclient.model.Comments;
import com.example.eureka.noteseurekaclient.model.Posts;
import com.example.eureka.noteseurekaclient.service.PostService;

//localhost:8082/posts/all

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	PostService postService;

	@GetMapping("/all")
	public ResponseEntity<List<Posts>> getAll() {

		return new ResponseEntity(postService.displayAll(), HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Posts> addPost(@RequestBody Posts post) {
		return new ResponseEntity(postService.addPost(post), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<String> deletePost(@PathVariable("pid") int pid) {

		String result = postService.deletePost(pid);
		return new ResponseEntity(result, HttpStatus.ACCEPTED);

	}

	@PutMapping("/update")
	public ResponseEntity<Posts> updatePost(@RequestBody Posts post) {

		return new ResponseEntity(postService.updatePost(post), HttpStatus.ACCEPTED);
	}

	@GetMapping("/author/{author}")
	public ResponseEntity<List<Posts>> getAllByAuthorName(@PathVariable("author") String author) {

		return new ResponseEntity(postService.searchPostsByAuthor(author), HttpStatus.OK);
	}
	@GetMapping("/title/{title}")
	public ResponseEntity<List<Posts>> getAllByTitle(@PathVariable("title") String title) {

		return new ResponseEntity(postService.searchPostsByTitle(title), HttpStatus.OK);
	}
	
	@GetMapping("/comments/{pid}")
	@HystrixCommand(fallbackMethod = "sendDummyData")
	public ResponseEntity<List<Comments>> getAllCommentsByPid(@PathVariable("pid") int pid){
		return new ResponseEntity(postService.searchCommentsByPid(pid), HttpStatus.OK);
	}
	
	@GetMapping("/id/{pid}")
	public ResponseEntity<Posts> getPostById(@PathVariable("pid") int pid){
		return new ResponseEntity(postService.getPostsById(pid), HttpStatus.OK);
	}
	
	public ResponseEntity<List<Comments>> sendDummyData(@PathVariable int postId){
		Comments comment1 = new Comments(7,"kishore kumar",5,"need more on java");
		Comments comment2 = new Comments(9,"sunil krishna",6,"very basic info");
		List<Comments> data = new ArrayList();
		data.add(comment1);
		data.add(comment2);
		return new ResponseEntity(data, HttpStatus.OK);
	}
	
}
