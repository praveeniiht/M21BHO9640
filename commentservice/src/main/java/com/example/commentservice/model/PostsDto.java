package com.example.commentservice.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class PostsDto {
	@Id
	String pid;
	@Column
	String title;
	@Column
	String author;
	@Column
	String description;
	@Column
	String status;
	public PostsDto() {
		
	}
	public PostsDto(String pid, String title, String author, String description, String status) {
		super();
		this.pid = pid;
		this.title = title;
		this.author = author;
		this.description = description;
		this.status = status;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
