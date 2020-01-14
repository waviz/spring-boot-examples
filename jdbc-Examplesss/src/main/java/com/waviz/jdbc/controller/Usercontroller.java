package com.waviz.jdbc.controller;
 
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.waviz.jdbc.Dao.UserDaoImpl;
import com.waviz.jdbc.model.UserApp;
import com.waviz.jdbc.model.Users;

	@RestController
	@CrossOrigin(origins = "*")
	public class Usercontroller {
		
  Logger log = LoggerFactory.getLogger(this.getClass());
		
	    @Autowired
	    UserDaoImpl userDaoImpl;
	    
	  //getAllUser
	    @GetMapping("/users")
	    public ResponseEntity<List<UserApp>> getAllUser()
	    {
	    	log.info("Users found with findAllUser()");
	        List<UserApp> userList = userDaoImpl.getAllUsers();
	        return new ResponseEntity<List<UserApp>>(userList, HttpStatus.OK);
	        
	    }
	    
	    
	  //getUserById
	    @GetMapping("/user/{id}")
	    public ResponseEntity<UserApp> getUserById(@PathVariable Integer id)
	    {
	    	log.info("Users found with findById()");
	    	UserApp user = userDaoImpl.getUserById(id);
	        return new ResponseEntity<UserApp>(user, HttpStatus.OK);
	    }

	  //new user b/w date
	    @GetMapping("/user/{date1}/{date2}")
	    public ResponseEntity<List<UserApp>> getUserByCreated_on(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	log.info("Users found with findByNewUser()");
	    	List<UserApp> userList = userDaoImpl.getUserByCreated_on(dateFrom,dateTo); 
	        return new ResponseEntity<List<UserApp>>(userList, HttpStatus.OK);
	    }
	    
	    //count new user b/e date 
	    @GetMapping("/count/{date1}/{date2}")
	    public String countUserByCreated_on(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	log.info("count new members");
	    	String count;
	    	count = userDaoImpl.countUserByCreated_on(dateFrom,dateTo); 
	        return count;
	    }
	    
	    //Active User b/w date
	    @GetMapping("/ActiveUser/{date1}/{date2}")
	    public ResponseEntity<List<UserApp>> getUserByStatusFromUser(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	log.info("Users found with findActiveUser()");
	    	List<UserApp> userList = userDaoImpl.getUserByStatusFromUser(dateFrom,dateTo); 
	        return new ResponseEntity<List<UserApp>>(userList, HttpStatus.OK);
	    }
	    
	    //Update
	    @PutMapping("/update")
	    public ResponseEntity<UserApp> updateArticle(@RequestBody UserApp user)
	    {
	    	log.info("Users found with UpdateUser()");
            userDaoImpl.updateUser(user);
	        return new ResponseEntity<UserApp>(user, HttpStatus.OK);
	    }
        
	    //Insert
	    @PostMapping("/insert")
	    public ResponseEntity<Void> insertArticle(@RequestBody UserApp user)
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

	    
	    //Create Event group_by b/w date
	    @GetMapping("/event/{date1}/{date2}")
	    public List<Users> getUsersByCreated_by(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	log.info("Users found with findAllNewEvent()");
	    	List<Users> usersList = userDaoImpl.getUsersByCreated_by(dateFrom,dateTo); 
	        return usersList;
	    }
	    
	  // Count Create Event group_by b/w date
	    @GetMapping("/events/{date1}/{date2}")
	    public List<Users> getEventsByUsers(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	log.info("no of events created by differents user");
	    	List<Users> usersList = userDaoImpl.getEventsByUsers(dateFrom,dateTo); 
	        return usersList;
	    }
	     
	  //Accept Reject user from Event_Participant
	    @GetMapping("/participant/{date1}/{date2}")
	    public List<Users>getUsersByAcceptAndRejectEvent_participant(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	log.info("Users found Accept And RejectEvent_participant()");
	    	List<Users> usersList = userDaoImpl.getUsersByAcceptAndRejectEvent_participant(dateFrom,dateTo); 
	        return usersList;
	    }
	    
	    
	//SenderNumber eventCreated no ofReciepent 
		    @GetMapping("/userInfo") 
		    public List<Users> getUserByPhone_NumberEvent_CreatedAndNoOfReciepent()
		    {
		    	log.info("get User Phone_NumberEvent_CreatedAndNoOfReciepent()");
		    	//String count;
		    	List<Users> users = userDaoImpl.getUserByPhone_NumberEvent_CreatedAndNoOfReciepent(); 
		        return users;
		    }
		    

      
}
