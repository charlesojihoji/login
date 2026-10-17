package com.softel.login.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private UUID userId;
	
	@Column(name="full_name", nullable=false)
	private String fullName;
	
	@Column(name="email_address", nullable=false)
	private String emailAddress;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="password", nullable=false)
	private String password;
	
	//admin or user or visitor
	@Column(name="role", nullable=false)
	private String role;
	
	public Users() {
		super();
	}

	public Users(UUID userId, String fullName, String emailAddress, String phoneNumber, String password,
			String role) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.role = role;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
