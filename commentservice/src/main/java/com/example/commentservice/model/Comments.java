package com.example.commentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comments {
	
	@Id
	Integer cid;
	@Column
	Integer pid;
	@Column
	String commenter;
	@Column
	String comment;
	public Comments() {
		
	}
	public Comments(Integer cid, Integer pid, String commenter, String comment) {
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
