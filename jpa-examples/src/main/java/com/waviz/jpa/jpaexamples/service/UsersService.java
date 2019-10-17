package  com.waviz.jpa.jpaexamples.service;

import  com.waviz.jpa.jpaexamples.model.Users;
import  com.waviz.jpa.jpaexamples.controller.UsersController;
import  org.springframework.beans.factory.annotation.Autowired;
import  com.waviz.jpa.jpaexamples.repository.UsersRepository;
import  org.springframework.stereotype.Service;
import  java.util.*;
import  org.springframework.web.bind.annotation.*;

@Service
public class UsersService {

@Autowired
private UsersRepository usersRepository;

public UsersService(UsersRepository usersRepository)
{
    System.out.println("Initailizing repository");
	this.usersRepository = usersRepository;
}
public List<Users> getAll()
{
 System.out.println("accepted your call,Userserviceforgetall()");
 return usersRepository.findAll();
}

public List<Users> insert(String name, String password, String email, Long mobile)
{
System.out.println("Hi recieved your call insertcontroller");
Users users = new Users();
users.setName(name);
users.setPassword(password);
users.setEmail(email);
users.setMobile(mobile);
usersRepository.save(users);
System.out.println("sending u the data");
return usersRepository.findAll();
}

public List<Users> update(int id,String name, String password, String email, Long mobile)                     

{
Users users = new Users();
users.setName(name);
users.setPassword(password);
users.setEmail(email);
users.setMobile(mobile);
usersRepository.save(users);
return usersRepository.findAll();
}

public List<Users> delete(int id)
{
 usersRepository.deleteById(id);
 System.out.println("accepted your call,Userservicefordelete");
 return usersRepository.findAll();
}
}
