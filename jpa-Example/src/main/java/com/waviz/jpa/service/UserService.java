package com.waviz.jpa.service;

import java.util.List;  
import java.util.Optional;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.waviz.jpa.Repository.UserRepository;
import com.waviz.jpa.model.User;



 @Service  
 public class UserService {
	
	 @Autowired  
	    private UserRepository userRepository; 
	 
	    public List<User> getAllUsers()
	    {  
	      
	     return  userRepository.findAll();  
	      
	    }  
	    public Optional<User> getUser(int id){  
	        return userRepository.findById(id);  
	    }  
	    public void AddUser(User user){  
	        userRepository.save(user);  
	    }  
	    public void delete(int id){  
	        userRepository.deleteById(id);  
	    }  

}
