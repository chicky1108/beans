package com.cg.capbook.beans;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
@Entity
public class Status {
	@Id
	String username;
	String status;
	@ManyToOne
	private UserAccount userAccount;
	
	@OneToMany(mappedBy="status", cascade=CascadeType.ALL)
	@MapKey
	private Map<Integer, Like> like;
	
	@OneToMany(mappedBy="status", cascade=CascadeType.ALL)
	@MapKey
	private Map<Integer, Comment> comment;
	
	@OneToMany(mappedBy="status", cascade=CascadeType.ALL)
	@MapKey
	private Map<Integer, Tag> tag;
	
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Status(String username, String status, UserAccount userAccount, Map<Integer, Like> like,
			Map<Integer, Comment> comment, Map<Integer, Tag> tag) {
		super();
		this.username = username;
		this.status = status;
		this.userAccount = userAccount;
		this.like = like;
		this.comment = comment;
		this.tag = tag;
	}

	
	
}
