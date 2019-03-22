package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Comment {
	@Id
	String username;
	String comment;
	@ManyToOne
	private Photo photo;
	
	@ManyToOne
	private Status status;

	public Comment(String username, String comment, Photo photo, Status status) {
		super();
		this.username = username;
		this.comment = comment;
		this.photo = photo;
		this.status = status;
	}

	public Comment() {
		super();
	}
	
	
}
