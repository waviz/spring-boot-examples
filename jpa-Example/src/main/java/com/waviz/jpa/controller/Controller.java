package com.waviz.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.waviz.jpa.model.User;
import com.waviz.jpa.service.UserService;
import java.util.List;
import java.util.Optional;



@RestController
public class Controller{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getAll")
	public List<User> getAllUser(){  
        return userService.getAllUsers();
       
    }   
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public List<User> AddAllUser(){
		User user = new User();
		userService.AddUser(user);
	return userService.getAllUsers();
		 
	}
	
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)  
	    public List<User> getUser(@PathVariable int id)
	{  
	       userService.delete(id);  
    
		return userService.getAllUsers();

}}
