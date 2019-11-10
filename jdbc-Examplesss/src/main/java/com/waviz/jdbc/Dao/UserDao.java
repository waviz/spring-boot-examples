package com.waviz.jdbc.dao;
import java.util.List;

import org.springframework.ui.Model;

import com.waviz.jdbc.model.EventParticipant;
import com.waviz.jdbc.model.User;
import com.waviz.jdbc.model.Users;
   
   public interface UserDao {
	List<User> getAllUsers();
	User getUserById(int id);
	List<User> getUserByCreated_on(String DateFrom,String DateTo);
	String countUserByCreated_on(String DateFrom,String DateTo);
	List<User> getUserByStatusFromUser(String DateFrom,String DateTo);
	void insertUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
	
	List<Users> getUsersByCreated_by(String DateFrom,String DateTo);
	List<Users> getEventsByUsers(String DateFrom,String DateTo);
	List<Users> getUsersByAcceptAndRejectEvent_participant(String DateFrom, String DateTo);
	List<Users> getUserByPhone_NumberEvent_CreatedAndNoOfReciepent();
	//List<User> getUserPhone_numberEvent_idAndCreated_on();
    
	
	
	
	
	

}
