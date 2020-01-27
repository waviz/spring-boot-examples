package com.waviz.jpa.jpaexamples.model;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import java.util.Date;
//import java.util.List;

@Entity
@Table(name = "users")
public class Users 
{
@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name;
private String password;
private String email;
private Long mobile;

public int getId()
{
return id;
}

public void setId(int id)
{
this.id = id;
}


public String getName()
{
return name;
}

public void setName(String name)
{
this.name = name;
}

public String getPassword()
{
return password;
}

public void setPassword(String password)
{
this.password = password;
}

public Long getMobile()
{
return mobile;
}
public void setMobile(Long mobile)
{
	this.mobile = mobile;
}
public String getEmail()
{
return email;
}
public void setEmail(String email)                                  
{
this.email = email;
}

@Override
public String toString(){

return "users[id="+id+", name=" + name + ",password=" + password +",email=" + email + ", mobile=" + mobile + "]";
}
}