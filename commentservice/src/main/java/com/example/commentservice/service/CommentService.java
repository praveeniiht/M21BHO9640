package com.example.commentservice.service;

import java.util.List;

import com.example.commentservice.model.Comments;



public interface CommentService {
	
	public List<Comments> getAllComments();
	public Comments addComment(Comments comment);
	public String deleteComment(Integer cid);
	public Comments updateComment(Comments comment);
	public List<Comments> searchCommentsByCommenter(String commenter);
	public List<Comments> searchCommentsByPid(Integer pid);
	
}
