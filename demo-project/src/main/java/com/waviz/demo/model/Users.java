package com.waviz.demo.model;
import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jwtuser")
public class Users {
 
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 
 @Column(name = "firstname")
 private String firstname;

 @Column(name = "lastname")
 private String lastname;
 
 @Column(name = "otp")
 private int otp;
 
 @Column(name = "email")
 private String email;
 
 @Column(name = "password")
 private String password;
 
 @Column(name = "created_at")
 private Timestamp created_at;
 
 public Users(){
     super();
 }
	
	  public Users(int id, String firstname, String lastname,int otp, String email, String password,Timestamp created_at) 
	  { 
	  super();
	  
	  this.id = id; 
	  this.firstname = firstname;
	  this.lastname = lastname;
	  this.otp = otp;
	  this.email = email; 
	  this.password = password;
	  this.created_at = created_at;
	  
	 }
	

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public int getOtp() {
	return otp;
}

public void setOtp(int otp) {
	this.otp = otp;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Timestamp getCreated_at() {
	return created_at;
}

public void setCreated_at(Timestamp created_at) {
	this.created_at = created_at;
}

}