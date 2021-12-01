package com.example.postservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.postservice.model.CommentsDto;
import com.example.postservice.model.Posts;
import com.example.postservice.repo.PostRepo;


@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	PostRepo repo;

	@Override
	public List<Posts> getAllPosts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Posts addPost(Posts post) {
		// TODO Auto-generated method stub
		return repo.save(post);
	}

	@Override
	public String deletePost(String pid) {
		// TODO Auto-generated method stub
		repo.deleteById(pid);
		return "Post Deleted";
	}

	@Override
	public Posts updatePost(Posts post) {
		// TODO Auto-generated method stub
		return repo.save(post);
	}

	@Override
	public List<Posts> searchPostsByAuthor(String author) {
		// TODO Auto-generated method stub
		return repo.searchPostsByAuthor(author);
	}

	@Override
	public List<Posts> searchPostsByTitle(String title) {
		// TODO Auto-generated method stub
		
		return repo.searchPostsByTitle(title);
	}

	@Override
	public List<CommentsDto> getCommentsByPostId(String pid) {
		// TODO Auto-generated method stu
		
		List<CommentsDto> temp = template.getForObject("http://localhost:8082/commentservice/posts/comments/search/"+pid, List.class);
		return temp;
	}

}
