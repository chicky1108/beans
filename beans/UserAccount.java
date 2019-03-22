package com.cg.capbook.beans;

import java.util.Date;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

@Entity
public class UserAccount {

	@Id
	private String emailId;
	private String firstName,lastName,gender,mobileNo,dateOfBirth,password;
	private Date date;
	@Embedded
	private Data data;
	@OneToMany(mappedBy="userAccount", cascade=CascadeType.ALL)
	@MapKey
	private Map<Integer, Photo> photos;
	
	@OneToMany(mappedBy="userAccount", cascade=CascadeType.ALL)
	@MapKey
	private Map<Integer, Status> status;
	
	public UserAccount() {}

	public UserAccount(String emailId, String firstName, String lastName, String gender, String mobileNo,
			String dateOfBirth, String password,Date date) {
		super();
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.date=date;
	}

	public UserAccount(String firstName, String lastName, String gender, String mobileNo, String dateOfBirth,
			String password,Date date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.date=date;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date=date;;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserAccount [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", mobileNo=" + mobileNo + ", dateOfBirth=" + dateOfBirth + ", password=" + password +"Date="+date +"]";
	}

	
}