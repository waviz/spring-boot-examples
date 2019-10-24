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
         user.setId(row.getLong("id"));
         user.setUser_name(row.getString("user_name"));
         user.setPassword(row.getString("password"));
         user.setEmail(row.getString("email"));
         user.setFirst_name(row.getString("first_name"));
         user.setLast_name(row.getString("last_name"));
         user.setPhone_number(row.getString("Phone_number"));
         user.setIs_verified(row.getBoolean("is_verified"));
         user.setOtp(row.getInt("otp"));
         user.setCountry_id(row.getInt("country_id"));
         user.setStatus(row.getInt("status"));
         user.setModified_by(row.getLong("modified_by"));
         user.setModified_on(row.getDate("modified_on"));
         user.setCreated_on(row.getDate("created_on"));
        
         

         return user;
    }
}