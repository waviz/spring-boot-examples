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
import  java.time.LocalDateTime;
import  org.slf4j.LoggerFactory;
import  org.slf4j.Logger;

@RestController
@RequestMapping("/users")
public class UserResource{

Logger logger = LoggerFactory.getLogger(UserResource.class);



@Autowired
private UserMapper userMapper;

@GetMapping("/all/{dateFrom}/{dateTo}/")
public List<String> getAll(@PathVariable String dateFrom,
                       @PathVariable String dateTo
)

{
 
logger.info("fetching phone numbers of new registered members");

return userMapper.find(dateFrom,dateTo);

}
}
