package com.example.commentservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.commentservice.model.Comments;
import com.example.commentservice.repo.CommentsRepo;



@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentsRepo repo;

	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Comments addComment(Comments comment) {
		// TODO Auto-generated method stub
		return repo.save(comment);
	}

	@Override
	public String deleteComment(Integer cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "Comment Deleted";
	}

	@Override
	public Comments updateComment(Comments comment) {
		// TODO Auto-generated method stub
		return repo.save(comment);
	}

	@Override
	public List<Comments> searchCommentsByCommenter(String commenter) {
			return repo.searchCommentsByCommenter(commenter);
		
	}

	@Override
	public List<Comments> searchCommentsByPid(Integer pid) {
		// TODO Auto-generated method stub
		return repo.searchCommentsByPid(pid);
	}

}
