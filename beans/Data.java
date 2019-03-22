package com.cg.capbook.beans;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Id;
@Embeddable
public class Data {
//	@Id
	private String username;
	@Embedded
	private Address address;
	private String education;
	private String relationshipStatus;
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Data(String username, Address address, String education, String relationshipStatus) {
		super();
		this.username = username;
		this.address = address;
		this.education = education;
		this.relationshipStatus = relationshipStatus;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getRelationshipStatus() {
		return relationshipStatus;
	}
	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((education == null) ? 0 : education.hashCode());
		result = prime * result + ((relationshipStatus == null) ? 0 : relationshipStatus.hashCode());
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
		Data other = (Data) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (education == null) {
			if (other.education != null)
				return false;
		} else if (!education.equals(other.education))
			return false;
		if (relationshipStatus == null) {
			if (other.relationshipStatus != null)
				return false;
		} else if (!relationshipStatus.equals(other.relationshipStatus))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Data [username=" + username + ", address=" + address + ", education=" + education
				+ ", relationshipStatus=" + relationshipStatus + "]";
	}
	
}
