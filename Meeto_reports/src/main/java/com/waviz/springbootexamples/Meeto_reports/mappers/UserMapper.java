package com.waviz.springbootexamples.Meeto_reports.mappers;

import java.util.List;
import com.waviz.springbootexamples.Meeto_reports.model.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;
import com.waviz.springbootexamples.Meeto_reports.util.UserContext;

@Mapper
public interface UserMapper{

@Select("SELECT * from user where created_on between '2019-09-30'and '2019-10-23'")
List<User> findAll(User u);

}
