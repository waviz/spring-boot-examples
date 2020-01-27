package com.waviz.mybatis.mybatisexamples.resource;

import  java.util.*;
import  java.lang.Long;
import  java.lang.String;
import  com.waviz.mybatis.mybatisexamples.mapper.UsersMapper;
import  com.waviz.mybatis.mybatisexamples.model.Users;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/users")
public class UsersResource{
//Users users = new Users();

private UsersMapper usersMapper;
public UsersResource(UsersMapper usersMapper)
{
this.usersMapper = usersMapper;
}

@GetMapping("/all")
public List<Users> getAll()
{
//System.out.println("")
return usersMapper.findAll();
}


//will insert and id will increase automatically
@GetMapping("/insert")
private List<Users> insert(@RequestParam String name,
                           @RequestParam String password,
                           @RequestParam(required = false) String email,
                           @RequestParam(required = false) Long mobile)
{
Users users = new Users();
users.setName(name);
users.setPassword(password);
users.setMobile(mobile);
users.setEmail(email);

usersMapper.insert(users);
return usersMapper.findAll();
}
//will Update in behalf of id
@GetMapping("/update")
private List<Users> update(@RequestParam int id,
                           @RequestParam(required = false) String name,
                           @RequestParam(required = false) String password,
                           @RequestParam(required = false ) String email,
                           @RequestParam(required = false ) Long mobile)
{
Users users = new Users();

users.setId(id);

//if(name.length() != 0 )

	users.setName(name);


//if( password.length()!= 0)
//{
   users.setPassword(password);
//}

//if( mobile!= 0)
//{
   users.setMobile(mobile);
//}

//if( email.length()!= 0)
//{
	users.setEmail(email);
//}
usersMapper.update(users);
return usersMapper.findAll();
}


//delete the row whose id will match
@GetMapping("/delete")
private List<Users> delete(@RequestParam int id)
{
Users users = new Users();
users.setId(id);
usersMapper.delete(users);
return usersMapper.findAll();
}
}
