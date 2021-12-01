package com.example.postservice.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class CommentsDto {
	

	@Id
	Integer cid;
	@Column
	Integer pid;
	@Column
	String commenter;
	@Column
	String comment;
	public CommentsDto() {
		
	}
	public CommentsDto(Integer cid, Integer pid, String commenter, String comment) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.commenter = commenter;
		this.comment = comment;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getCommenter() {
		return commenter;
	}
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
