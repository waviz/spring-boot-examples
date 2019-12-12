package com.waviz.demo.model;
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
 
 @Column(name = "email")
 private String email;
 
 @Column(name = "password")
 private String password;
 
 public Users(){
     super();
 }
	
	  public Users(int id, String firstname, String lastname, String email, String password) 
	  { 
	  super();
	  
	  this.id = id; 
	  this.firstname = firstname;
	  this.lastname = lastname; 
	  this.email = email; 
	  this.password = password;
	  
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

}