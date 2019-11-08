package com.waviz.jdbc.controller;
 
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.waviz.jdbc.dao.UserDaoImpl;
//import com.waviz.jdbc.model.EventParticipant;
import com.waviz.jdbc.model.User;
       @CrossOrigin(origins = "*")
       @RestController
	public class Usercontroller {
		
		Logger log = LoggerFactory.getLogger(this.getClass());
		
	    @Autowired
	    UserDaoImpl userDaoImpl;
	    
	  //getAllUser
	    @GetMapping("/users")
	    public ResponseEntity<List<User>> getAllUser()
	    {
	    	log.info("Users found with findAllUser()");
	        List<User> userList = userDaoImpl.getAllUsers();
	        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	    }
	    
	    
	  //getUserById
	    @GetMapping("/user/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable Integer id)
	    {
	    	log.info("Users found with findById()");
	    	User user = userDaoImpl.getUserById(id);
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	    }
	    
	  //Create user b/e date
	    @GetMapping("/user/{date1}/{date2}")
	    public ResponseEntity<List<User>> getUserByCreated_on(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	log.info("Users found with findByNewUser()");
	    	List<User> userList = userDaoImpl.getUserByCreated_on(dateFrom,dateTo); 
	        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	    }
	    
	  //Create Event group_by b/w date
	    @GetMapping("/event/{date1}/{date2}")
	    public ResponseEntity<List<User>> getUserByCreated_by(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	log.info("Users found with findAllNewEvent()");
	    	List<User> userList = userDaoImpl.getUserByCreated_by(dateFrom,dateTo); 
	        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	    }
	   
	    //Active User b/w date
	    @GetMapping("/ActiveUser/{date1}/{date2}")
	    public ResponseEntity<List<User>> getUserByStatusFromUser(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	log.info("Users found with findActiveUser()");
	    	List<User> userList = userDaoImpl.getUserByStatusFromUser(dateFrom,dateTo); 
	        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	    }
	    
	  //Accept Reject user from Event_Participant
	    @GetMapping("/participant/{date1}/{date2}")
	    public ResponseEntity<List<User>>getUserByEvent_participant(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	log.info("Users found Accept And RejectEvent()");
	    	List<User> userList = userDaoImpl.getUserByEvent_participant(dateFrom,dateTo); 
	        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	    }

        //Update
	    @PutMapping("/update")
	    public ResponseEntity<User> updateArticle(@RequestBody User user)
	    {
	    	log.info("Users found with UpdateUser()");
            userDaoImpl.updateUser(user);
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	    }
        
	    //Insert
	    @PostMapping("/insert")
	    public ResponseEntity<Void> insertArticle(@RequestBody User user)
	    {
	    	log.info(" Insert New Data()");
	    	userDaoImpl.insertUser(user);
	        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	    }

	    //Delete
	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id)
	    {
	    	log.info("Delete ById with findAllUser");
	    	userDaoImpl.deleteUser(id);
	        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	    }

}
