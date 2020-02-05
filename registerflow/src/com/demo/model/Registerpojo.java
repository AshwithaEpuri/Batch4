package com.demo.model;

public class Registerpojo {
private String userName;
private String password;
private String name;
private String dob;
private String gender;
private String Hobbies;
private String Address;
private String Country;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getHobbies() {
	return Hobbies;
}
public void setHobbies(String hobbies) {
	Hobbies = hobbies;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public Registerpojo(String userName, String password, String name, String dob, String gender, String hobbies,
		String address, String country) {
	super();
	this.userName = userName;
	this.password = password;
	this.name = name;
	this.dob = dob;
	this.gender = gender;
	Hobbies = hobbies;
	Address = address;
	Country = country;
}
public Registerpojo() {
	super();
	// TODO Auto-generated constructor stub
}


	
}
