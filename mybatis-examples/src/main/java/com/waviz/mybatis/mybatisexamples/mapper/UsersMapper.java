package com.waviz.mybatis.mybatisexamples.mapper;

import java.util.*;
import com.waviz.mybatis.mybatisexamples.model.Users;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UsersMapper
{
@Select("select * from users")
List<Users> findAll();

@Insert("insert into users(id,name,password,email,mobile) values(#{id},#{name},#{password},#{email},#{mobile})")
void insert(Users users);

@Delete("DELETE from users WHERE id = #{id}")
void delete(Users users);

@Update("UPDATE users SET name=#{name},password=#{password},mobile=#{mobile},email=#{email} where id =#{id}" )
void update(Users users);

}



