package com.waviz.springbootexamples.Meeto_reports.mappers;

import  org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.waviz.springbootexamples.Meeto_reports.model.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper{


@Select("SELECT count(phone_number) from user where created_on between #{dateFrom} and #{dateTo}")
String count(String dateFrom,String dateTo);

@Select("SELECT phone_number from user where created_on between #{dateFrom} and #{dateTo}")
List<String> findNewMembers(String dateFrom,String dateTo);


}
