package edu.uoengland.login.dto;

import java.util.List;

public class LoginResponse {

	private String userEmail;
    private String userName;
    private List<String> roles;
    private String message;
    
	public LoginResponse() {
		super();
	}

	public LoginResponse(String userEmail, String userName, List<String> roles, String message) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		this.roles = roles;
		this.message = message;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
}
