package com.cg.capbook.beans;

import java.io.File;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
@Entity
public class Photo {
	@Id
	private String username;
	private String imageURL;
	private File file;
	@ManyToOne
	private UserAccount userAccount;
	
	@OneToMany(mappedBy="photo", cascade=CascadeType.ALL)
	@MapKey
	private Map<Integer, Like> like;
	
	@OneToMany(mappedBy="status", cascade=CascadeType.ALL)
	@MapKey
	private Map<Integer, Comment> comment;
	
	@OneToMany(mappedBy="status", cascade=CascadeType.ALL)
	@MapKey
	private Map<Integer, Tag> tag;

	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Photo(String username, String imageURL, File file, UserAccount userAccount, Map<Integer, Like> like,
			Map<Integer, Comment> comment, Map<Integer, Tag> tag) {
		super();
		this.username = username;
		this.imageURL = imageURL;
		this.file = file;
		this.userAccount = userAccount;
		this.like = like;
		this.comment = comment;
		this.tag = tag;
	}
	
}
