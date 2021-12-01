package com.example.postservice.service;

import java.util.List;

import com.example.postservice.model.CommentsDto;
import com.example.postservice.model.Posts;

public interface PostService {
	
	public List<Posts> getAllPosts();
	public Posts addPost(Posts post);
	public String deletePost(String pid);
	public Posts updatePost(Posts post);
	public List<Posts> searchPostsByAuthor(String author);
	public List<Posts> searchPostsByTitle(String title);
	
	public List<CommentsDto> getCommentsByPostId(String pid);
	

}
