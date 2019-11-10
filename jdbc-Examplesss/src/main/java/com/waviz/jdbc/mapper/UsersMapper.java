package com.waviz.jdbc.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.waviz.jdbc.model.Users;

public class UsersMapper implements RowMapper<Users>
{
    @Override
    public Users mapRow(ResultSet rs, int rownumber) throws SQLException 
    {
         Users users = new Users();
         
         users.setId(rs.getLong("id"));
         users.setUser_name(rs.getString("user_name"));
         users.setPassword(rs.getString("password"));
         users.setEmail(rs.getString("email"));
         users.setFirst_name(rs.getString("first_name"));
         users.setLast_name(rs.getString("last_name"));
         users.setPhone_number(rs.getString("Phone_number"));
         users.setIs_verified(rs.getBoolean("is_verified"));
         users.setOtp(rs.getInt("otp"));
         users.setCountry_id(rs.getInt("country_id"));
         users.setStatus(rs.getInt("status"));
         users.setModified_by(rs.getLong("modified_by"));
         users.setModified_on(rs.getDate("modified_on"));
         users.setCreated_on(rs.getDate("created_on"));
       //  event.setId(row.getLong("id"));
         users.setCalendar_id(rs.getInt("calendar_id"));
         users.setOrganization(rs.getLong("organization"));
         users.setRoute_type(rs.getByte("route_type"));
         users.setSender_id(rs.getString("sender_id"));
         users.setTitle(rs.getString("title"));
         users.setImage_url(rs.getString("image_url"));
         users.setTemplate(rs.getLong("template"));
         users.setStart_date_time(rs.getDate("start_date_time"));
         users.setEnd_date_time(rs.getDate("end_date_time"));
         users.setLocation(rs.getString("location"));
         users.setDescription(rs.getString("description"));
         users.setReminder(rs.getString("reminder"));
		// event.setStatus(row.getByte("status"));
         users.setDuration(rs.getString("duration"));
         users.setSource(rs.getInt("source"));
		// event.setCreated_on(row.getDate("created_on"));
         users.setCreated_by(rs.getLong("created_by"));
         users.setUpdated_on(rs.getDate("updated_on"));
         users.setUpdated_by(rs.getLong("updated_by"));
         users.setCounter(rs.getInt("counter"));
         //users.setId(rs.getLong("id"));
         users.setEvent_id(rs.getLong("event_id"));
         users.setName(rs.getString("name"));
         users.setPhone_number(rs.getString("sender_number"));
         users.setCountry_code(rs.getString("country_code"));
         users.setDisplay_number(rs.getString("display_number"));
       //  users.setStatus(rs.getInt("status"));
         users.setIs_viewed(rs.getBoolean("is_viewed"));
         users.setNotified(rs.getBoolean("notified"));
        // users.setStatus(rs.getInt("status"));
       //  users.setCreated_on(rs.getDate("created_on"));
       //  users.setUpdated_on(rs.getDate("updated_on"));
         users.setRejected(rs.getBoolean("rejected"));
         users.setNumber_of_recipents(rs.getLong("number_of_recipents"));
         users.setEvent_rejected(rs.getInt("Event_rejected"));
        
          return users;
    }
}