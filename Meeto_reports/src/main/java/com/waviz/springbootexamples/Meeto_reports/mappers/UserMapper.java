package com.waviz.springbootexamples.Meeto_reports.mappers;

import  org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.waviz.springbootexamples.Meeto_reports.model.User;
import  com.waviz.springbootexamples.Meeto_reports.model.UserDetails;
import com.waviz.springbootexamples.Meeto_reports.model.Event_participant;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper{

@Select("SELECT count(phone_number) from user where created_on between #{dateFrom} and #{dateTo}")
String count(String dateFrom,String dateTo);


@Select("SELECT name from event_participant where (created_on between #{dateFrom} and #{dateTo}) and rejected = 1 and is_viewed = 1 group by name")
List<String> rejectedEvent(String dateFrom,String dateTo);

@Select("SELECT id,created_on,phone_number from user where created_on between #{dateFrom} and #{dateTo}")
List<User> newUsers(String dateFrom,String dateTo);

@Select("SELECT count(e.created_by) as counter,u.phone_number  FROM event e inner join user u on e.created_by = u.id where e.created_on between #{dateFrom} and #{dateTo} group by created_by order by counter desc")
List<UserDetails> events(String dateFrom,String dateTo);

@Select("SELECT name,count(rejected) as count from event_participant where (created_on between #{dateFrom} and #{dateTo}) and rejected = 1 and is_viewed = 1 group by name order by count desc")
List<Event_participant> rejected(String dateFrom,String dateTo);

@Select("select u.phone_number ,r.event_id,e.created_on,count(r.event_id) as number_of_recipents from event_participant as r inner join event as e on e.id = r.event_id inner join user as u on e.created_by = u.id where e.created_on between #{dateFrom} and #{dateTo} group by r.event_id")
List<UserDetails> sender(String dateFrom,String dateTo);



}
