package com.waviz.mybatis.mybatisexamples.resource;

import  java.util.*;
import  com.waviz.mybatis.mybatisexamples.mapper.UsersMapper;
import  com.waviz.mybatis.mybatisexamples.model.Users;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UsersResource{

private UsersMapper usersMapper;
public UsersResource(UsersMapper usersMapper)
{
this.usersMapper = usersMapper;
}

@GetMapping("/all")
public List<Users> getAll()
{
return usersMapper.findAll();
}


@GetMapping("/insert")
private List<Users> insert()
{
Users users = new Users();
users.setName("Am");
users.setPassword("waviz");
users.setMobile(9134934335L);
users.setEmail("aman@gmail.com");
usersMapper.insert(users);
return usersMapper.findAll();
}


@GetMapping("/update")
private List<Users> update()
{
Users users = new Users();
users.setId(3);
users.setName("ankita");
users.setPassword("wavizF");
users.setMobile(9137434L);
users.setEmail("akita@gmail.com");
usersMapper.update(users);
return usersMapper.findAll();
}
@GetMapping("/delete")
private List<Users> delete()
{
Users users = new Users();
users.setId(2);
usersMapper.delete(users);
return usersMapper.findAll();
}
}
