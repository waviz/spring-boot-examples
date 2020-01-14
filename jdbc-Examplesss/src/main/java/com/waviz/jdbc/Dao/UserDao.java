package com.waviz.jdbc.Dao;

import java.util.List;
import com.waviz.jdbc.model.UserApp;
import com.waviz.jdbc.model.Users;
   
   public interface UserDao {
	List<UserApp> getAllUsers();
	UserApp getUserById(int id);
	List<UserApp> getUserByCreated_on(String DateFrom,String DateTo);
	String countUserByCreated_on(String DateFrom,String DateTo);
	List<UserApp> getUserByStatusFromUser(String DateFrom,String DateTo);
	void insertUser(UserApp user);
    void updateUser(UserApp user);
    void deleteUser(int id);
	
	List<Users> getUsersByCreated_by(String DateFrom,String DateTo);
	List<Users> getEventsByUsers(String DateFrom,String DateTo);
	List<Users> getUsersByAcceptAndRejectEvent_participant(String DateFrom, String DateTo);
	List<Users> getUserByPhone_NumberEvent_CreatedAndNoOfReciepent();
	//List<User> getUserPhone_numberEvent_idAndCreated_on();
}
