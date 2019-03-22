package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Tag {
	@Id
	String username;
	@ManyToOne
	private Photo photo;
	
	@ManyToOne
	private Status status;
	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Tag(String username, Photo photo, Status status) {
		super();
		this.username = username;
		this.photo = photo;
		this.status = status;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tag [username=" + username + "]";
	}
	
}
