package com.waviz.springbootexamples.Meeto_reports.mappers;

import  org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.waviz.springbootexamples.Meeto_reports.model.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper{


@Select("SELECT phone_number from user where created_on between #{dateFrom} and #{dateTo}")
List<String> find(String dateFrom,String dateTo);

}
