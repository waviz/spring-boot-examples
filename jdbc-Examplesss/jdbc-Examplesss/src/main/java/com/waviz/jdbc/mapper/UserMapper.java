package com.waviz.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.waviz.jdbc.model.User;

public class UserMapper implements RowMapper<User>
{
    @Override
    public User mapRow(ResultSet row, int rowNum) throws SQLException 
    {
         User user = new User();
         user.setId(row.getInt("id"));
         user.setName(row.getString("name"));
         user.setPassword(row.getString("password"));
         user.setEmail(row.getString("email"));
         return user;
    }
}