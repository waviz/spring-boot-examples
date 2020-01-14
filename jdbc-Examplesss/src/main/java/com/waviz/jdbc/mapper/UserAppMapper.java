package com.waviz.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.waviz.jdbc.model.UserApp;

public class UserAppMapper implements RowMapper<UserApp>
{
    @Override
    public UserApp mapRow(ResultSet rs, int rownumber) throws SQLException 
    {
         UserApp user = new UserApp();
         user.setId(rs.getLong("id"));
         user.setUser_name(rs.getString("user_name"));
         user.setPassword(rs.getString("password"));
         user.setEmail(rs.getString("email"));
         user.setFirst_name(rs.getString("first_name"));
         user.setLast_name(rs.getString("last_name"));
         user.setPhone_number(rs.getString("Phone_number"));
         user.setIs_verified(rs.getBoolean("is_verified"));
         user.setOtp(rs.getInt("otp"));
         user.setCountry_id(rs.getInt("country_id"));
         user.setStatus(rs.getInt("status"));
         user.setModified_by(rs.getLong("modified_by"));
         user.setModified_on(rs.getDate("modified_on"));
         user.setCreated_on(rs.getDate("created_on"));
        
          return user;
    }
}