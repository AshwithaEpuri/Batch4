package com.demo.model;

public class LoginPojo {
   private String username;
   private String password;
   private String role;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
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
public LoginPojo(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public LoginPojo() {
	super();
	// TODO Auto-generated constructor stub
}
   
}
