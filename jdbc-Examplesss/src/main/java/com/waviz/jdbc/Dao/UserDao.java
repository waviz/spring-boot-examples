package com.waviz.jdbc.dao;

 
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.waviz.jdbc.model.User;
   
   public interface UserDao {
	List<User> getAllUsers();
	User getUserById(int id);
	List<User> getUserByCreated_on(String DateFrom,String DateTo);
	List<User> getUserByCreated_by(String DateFrom,String DateTo);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
	
	
	

}
