package com.waviz.springbootexamples.Meeto_reports.resources;
import  java.time.LocalDate;
import  java.util.*;
import  java.lang.Long;
import  java.lang.String;
import  com.waviz.springbootexamples.Meeto_reports.mappers.UserMapper;
import  com.waviz.springbootexamples.Meeto_reports.model.User;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.web.bind.annotation.PathVariable;
import  com.waviz.springbootexamples.Meeto_reports.util.UserContext;
import  java.time.LocalDateTime;

@RestController
@RequestMapping("/users")
public class UserResource{

@Autowired
private UserMapper userMapper;

@GetMapping("/all")
public List<User> getAll()

{
//LocalDateTime dateFrom = LocalDate.parse(dateFrom); 
//LocalDateTime dateTo = LocalDate.parse(dateTo); 
//@GetMapping("/all/{dateFrom}/{dateTo}/")

//public List<User> getAll(@PathVariable String dateFrom,
  //                       @PathVariable String dateTo
//)


 
 //UserContext u = new UserContext();
 //u.setCreated_On1(dateFrom);
 //u.setCreated_On2(dateTo);


User u = new User();
return userMapper.findAll(u);

}
}
