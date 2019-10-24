package com.waviz.jdbc.controller;
    import java.util.Date;
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.waviz.jdbc.dao.UserDaoImpl;
import com.waviz.jdbc.model.User;

	@RestController
	public class Usercontroller {
		
	    @Autowired
	    UserDaoImpl userDaoImpl;
	    
	    @GetMapping("/users")
	    public ResponseEntity<List<User>> getAllUser()
	    {
	        List<User> userList = userDaoImpl.getAllUsers();
	        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	    }

	    @GetMapping("/user/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable Integer id)
	    {
	    	User user = userDaoImpl.getUserById(id);
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	    }
	    
	    @GetMapping("/user/{date1}/{date2}")
	    public ResponseEntity<List<User>> getUserByCreated_on(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	List<User> userList = userDaoImpl.getUserByCreated_on(dateFrom,dateTo); 
	        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	    }
	    
	    @GetMapping("/event/{date1}/{date2}")
	    public ResponseEntity<List<User>> getUserByCreated_by(@PathVariable("date1") String dateFrom,
	    		@PathVariable("date2") String dateTo)
	    {
	    	List<User> userList = userDaoImpl.getUserByCreated_by(dateFrom,dateTo); 
	        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	    }


	    @PutMapping("/update")
	    public ResponseEntity<User> updateArticle(@RequestBody User user)
	    {
            userDaoImpl.updateUser(user);
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	    }

	    @PostMapping("/insert")
	    public ResponseEntity<Void> insertArticle(@RequestBody User user)
	    {
	    	userDaoImpl.insertUser(user);
	        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id)
	    {
	    	userDaoImpl.deleteUser(id);
	        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	    }

}
