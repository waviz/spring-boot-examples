package com.waviz.jdbc.Dao;

   import java.util.List;

import com.waviz.jdbc.model.User;
   
   public interface UserDao {
	List<User> getAllUsers();
	User getUserById(int id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
	

}
