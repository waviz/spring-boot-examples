package com.waviz.jdbc.controller;
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

    import com.waviz.jdbc.Dao.UserDaoImpl;
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
	    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id)
	    {
	    	User user = userDaoImpl.getUserById(id);
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	    }

	    @PutMapping("/user")
	    public ResponseEntity<User> updateArticle(@RequestBody User user)
	    {
            userDaoImpl.updateUser(user);
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	    }

	    @PostMapping("/user")
	    public ResponseEntity<Void> addArticle(@RequestBody User User)
	    {
	    	userDaoImpl.addUser(User);
	        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	    }

	    @DeleteMapping("/user/{id}")
	    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id)
	    {
	    	userDaoImpl.deleteUser(id);
	        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	    }

}
