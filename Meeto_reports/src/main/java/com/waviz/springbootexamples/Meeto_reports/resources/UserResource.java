package com.waviz.springbootexamples.Meeto_reports.resources;
import  java.time.LocalDate;
import  java.util.*;
import  java.lang.Long;
import  java.lang.String;
import  com.waviz.springbootexamples.Meeto_reports.mappers.UserMapper;
import  com.waviz.springbootexamples.Meeto_reports.model.User;
import  org.springframework.web.bind.annotation.RequestMapping;
import  com.waviz.springbootexamples.Meeto_reports.model.UserDetails;
import  org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.web.bind.annotation.PathVariable;
import  com.waviz.springbootexamples.Meeto_reports.model.Event_participant;
import  java.time.LocalDateTime;
import  org.slf4j.LoggerFactory;
import  org.slf4j.Logger;
import  org.springframework.web.bind.annotation.CrossOrigin;

@RestController                 
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserResource{

Logger logger = LoggerFactory.getLogger(UserResource.class);



@Autowired
private UserMapper userMapper;


@GetMapping("/all/{dateFrom}/{dateTo}/")
public List<User> newUsers(@PathVariable String dateFrom,
                       @PathVariable String dateTo)
{
User user = new User();
logger.info("fetching phone numbers of new registered members inputting dates between from- "+ dateFrom +" to " +dateTo);
return userMapper.newUsers(dateFrom,dateTo);
}

@GetMapping("/event/{dateFrom}/{dateTo}/")
public List<UserDetails> events(@PathVariable String dateFrom,
                       @PathVariable String dateTo)
{
UserDetails user = new UserDetails();
logger.info("fetching users with no of events created by them from  "+ dateFrom +" to " +dateTo);
return userMapper.events(dateFrom,dateTo);
}

@GetMapping("/reject/{dateFrom}/{dateTo}/")
public List<Event_participant> rejected(@PathVariable String dateFrom,
                       @PathVariable String dateTo)
{
Event_participant user = new Event_participant();
logger.info("fetching users with who rejected events  "+ dateFrom +" to " +dateTo);
return userMapper.rejected(dateFrom,dateTo);
}

@GetMapping("/count/{dateFrom}/{dateTo}/")
public String countAll(@PathVariable String dateFrom,
                       @PathVariable String dateTo
)
{
logger.info("total number of new registered members");
String count;
count = userMapper.count(dateFrom,dateTo);
return count;
}

@GetMapping("/sender/{dateFrom}/{dateTo}/")
public List<UserDetails> sender(@PathVariable String dateFrom,
                       @PathVariable String dateTo)
{
UserDetails user = new UserDetails();
logger.info("fetching sender and  no of reciept for a event_id created by them from  "+ dateFrom +" to " +dateTo);
return userMapper.sender(dateFrom,dateTo);
}


@GetMapping("/rejectCount/{dateFrom}/{dateTo}/")
public List<String> rejectevent(@PathVariable String dateFrom,
                       @PathVariable String dateTo
)

{

logger.info("Rejected events");

return userMapper.rejectedEvent(dateFrom,dateTo);

}







}
