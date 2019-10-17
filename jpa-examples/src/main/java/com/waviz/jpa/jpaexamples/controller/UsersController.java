package com.waviz.jpa.jpaexamples.controller;

import com.waviz.jpa.jpaexamples.service.UsersService;
import com.waviz.jpa.jpaexamples.model.Users;
import java.util.*;
import java.lang.Integer;
import java.lang.Long;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UsersController
{
@Autowired	
private UsersService usersService;

public UsersController(UsersService usersService)
{
	this.usersService = usersService;
}

@GetMapping("/all")
private List<Users> get()
{ 
System.out.println("Hi callling all data services");
return usersService.getAll();

}

@GetMapping("/insert")
 private List<Users> insert(@RequestParam String name,
	                 @RequestParam(required = false) String password,
	                 @RequestParam(required = false) String email,
	                 @RequestParam(required = false) Long mobile)
{
 System.out.println("Hi callling insert services");
 return usersService.insert(name,password,email,mobile);
}

@GetMapping("/update/{id}")
private List<Users> update(@PathVariable int id,
 	                 @RequestParam( required = false) String name,
	                 @RequestParam( required = false) String password,
	                 @RequestParam( required = false) String email,
	                 @RequestParam( required = false) Long mobile)
{
return usersService.update(id,name,password,email,mobile);

}


@GetMapping("/delete/{id}")
 private List<Users> delete(@PathVariable int id)
{
  return usersService.delete(id);
}
}


