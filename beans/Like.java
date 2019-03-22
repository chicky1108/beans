package com.cg.capbook.beans;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
@Entity
public class Like {
	@Id
	String username;
	@ManyToOne
	private Photo photo;
	
	@ManyToOne
	private Status status;

	public Like() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Like(String username, Photo photo, Status status) {
		super();
		this.username = username;
		this.photo = photo;
		this.status = status;
	}
	
}
