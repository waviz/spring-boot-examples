package com.waviz.jdbc.model;

import java.util.Date;


public class UserApp{
  private Long id;
  private String user_name;
  private String password;
  private String email;
  private String first_name;
  private String last_name;
  private String phone_number;
  private boolean is_verified;
  private int otp;
  private int country_id;
  private int status;
  private Long modified_by;
  private Date modified_on;
  private Date created_on;
 
  
  public UserApp()
  {
      super();
  }
  public UserApp(String name, String password, String email, String first_name, String last_name, String Phone_number,boolean is_verified, 
	int country_id, int status, Long modified_by, Date modified_on, Date created_on)
  {
      super();
      this.id = id;
      this.user_name = name;
      this.password = password;
      this.email = email;
      this.first_name = first_name;
      this.last_name = last_name;
      this.phone_number = phone_number;
      this.is_verified = is_verified;
      this.otp = otp;
      this.country_id = country_id;
      this.status = status;
      this.modified_by = modified_by;
      this.modified_on = modified_on;
      this.created_on = created_on;
        
  }
  
    public Long getId() {
	return id;
  }
   public void setId(Long id) {
	this.id = id;
 }
  public String getUser_name() {
	return user_name;
 }
  public void setUser_name(String user_name) {
	this.user_name = user_name;
 }
 public String getPassword() {
	return password;
 }
 public void setPassword(String password) {
	this.password = password;
 }
 public String getEmail() {
	return email;
 }
  public void setEmail(String email) {
	this.email = email;
 }
 public String getFirst_name() {
	return first_name;
 }
 public void setFirst_name(String first_name) {
	this.first_name = first_name;
 }
 public String getLast_name() {
	return last_name;
 }
 public void setLast_name(String last_name) {
	this.last_name = last_name;
 }
 public String getPhone_number() {
	return phone_number;
 }
 public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
 }
  public boolean getIs_verified() {
	return is_verified;
 }
 public void setIs_verified(boolean is_verified) {
	this.is_verified = is_verified;
 }
 public int getOtp() {
	return otp;
 }
 public void setOtp(int otp) {
	this.otp = otp;
 } 
  public int getCountry_id() {
	return country_id;
 }
 public void setCountry_id(int country_id) {
	this.country_id = country_id;
 }
 public int getStatus() {
	return status;
 }
 public void setStatus(int status) {
	this.status = status;
 }
 public Long getModified_by() {
	return modified_by;
 }
 public void setModified_by(Long modified_by) {
	this.modified_by = modified_by;
 }
 public Date getModified_on() {
	return modified_on;
 }
 public void setModified_on(Date modified_on) {
	this.modified_on = modified_on;
 }
 public Date getCreated_on() {
	return created_on;
 }
 public void setCreated_on(Date created_on) {
	this.created_on = created_on;
 }
	public static UserApp fromId(Long id){
        UserApp user=new UserApp();
        user.setId(id);
        return user;
    }
}
