package com.waviz.jdbc.dao;
import java.util.List;

//import com.waviz.jdbc.model.EventParticipant;
import com.waviz.jdbc.model.User;
   
   public interface UserDao {
	List<User> getAllUsers();
	User getUserById(int id);
	List<User> getUserByCreated_on(String DateFrom,String DateTo);
	List<User> getUserByCreated_by(String DateFrom,String DateTo);
	List<User> getUserByStatusAndCreated_on(String DateFrom,String DateTo);
	List<User> getUserByEvent_participant(String DateFrom, String DateTo);
	void insertUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
	
	
	
	

}
