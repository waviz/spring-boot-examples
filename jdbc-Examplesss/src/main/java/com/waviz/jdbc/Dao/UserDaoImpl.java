package com.waviz.jdbc.dao;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;
import com.waviz.jdbc.mapper.EventParticipantMapper;
import com.waviz.jdbc.mapper.UserMapper;
import com.waviz.jdbc.mapper.UsersMapper;
import com.waviz.jdbc.model.EventParticipant;
import com.waviz.jdbc.model.User;
import com.waviz.jdbc.model.Users;

@Repository
public class UserDaoImpl implements UserDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    //getAllUser
    @Override
    public List<User> getAllUsers()
    {
        String sql = "select * from user";
        List<User> userList = jdbcTemplate
                .query(sql, new UserMapper());
        return userList;
    }
    
    //getUserById
    @Override
    public User getUserById(int id)
    {
        String sql = "select * from user where id =?";
        User user = jdbcTemplate
                .queryForObject(sql, new UserMapper(), id);
        return user;
    }
    
    //new user b/e date
    @Override
    public List<User> getUserByCreated_on(String DateFrom ,String DateTo) {
    
        String sql = "SELECT * from user where created_on between ? and ?";
        List<User> userList = jdbcTemplate
                .query(sql, new UserMapper(),DateFrom,DateTo);
        return userList;
    }
    
   // count new user b/e date
    @Override
    public String countUserByCreated_on(String DateFrom ,String DateTo) {
        String sql = "SELECT count(phone_number) from user where created_on between ? and ?";
        String count = jdbcTemplate
        		 .queryForObject(sql,String.class,DateFrom,DateTo);
                
        return count;
    }
    
  //Active User b/w date
    @Override
    public List<User> getUserByStatusFromUser(String DateFrom ,String DateTo) {
    
        String sql = "SELECT * FROM user where status = '1' and created_on between ? and ?";
        List<User> userList = jdbcTemplate
                .query(sql, new UserMapper(),DateFrom,DateTo);
        return userList;
    }
    
    //Insert
    @Override
    public void insertUser(User user)
    {
        String sql = "insert into user (id,user_name,password,email,first_name,last_name,phone_number,is_verified,otp,country_id,status,modified_by,modified_on,created_on) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, user.getId(),user.getUser_name(),user.getPassword(),user.getEmail(),user.getFirst_name(),user.getLast_name(),user.getPhone_number(),user.getIs_verified(),user.getOtp(),user.getCountry_id(),user.getStatus(),user.getModified_by(),user.getModified_on(),user.getCreated_on());
    }

    //Update
    @Override
    public void updateUser(User user)
    {
        String sql = "update user set user_name = ?,password = ?,email = ?,first_name = ?,last_name = ?,phone_number = ?,is_verified = ?,otp = ?,country_id = ?,status = ?,modified_by = ?,modified_on = ?,created_on = ? where id = ?";
        jdbcTemplate.update(sql, user.getId(),user.getUser_name(),user.getPassword(),user.getEmail(),user.getFirst_name(),user.getLast_name(),user.getPhone_number(),user.getIs_verified(),user.getOtp(),user.getCountry_id(),user.getStatus(),user.getModified_by(),user.getModified_on(), user.getCreated_on());
    }
    
    //Delete
    @Override
    public void deleteUser(int id)
    {
        String sql = "delete from User where id = ?";
        jdbcTemplate.update(sql, id);
    }
    
           
    //Create Event b/w date
    @Override
    public List<Users> getUsersByCreated_by(String DateFrom ,String DateTo) {
    	
    String sql = "SELECT * FROM event e inner join user u on e.created_by = u.id where e.created_on between ? and ? group by created_by";
    return jdbcTemplate.query(sql,
            new BeanPropertyRowMapper<Users>(Users.class),DateFrom , DateTo);
    	// List<Users> usersList  = jdbcTemplate.query(sql, new UsersMapper(),DateFrom,DateTo);
               // .query(sql, new UserMapper(),DateFrom,DateTo);

    }
  // Count Create  Event  b/w date
    @Override
    public List<Users> getEventsByUsers(String DateFrom ,String DateTo) {	
    String sql = "SELECT count(e.created_by) as counter,u.phone_number  FROM event  e inner join user u on e.created_by = u.id where e.created_on between ? and ? group by created_by order by counter desc";
    return jdbcTemplate.query(sql,
            new BeanPropertyRowMapper<Users>(Users.class),DateFrom , DateTo);
    	// List<Users> usersList  = jdbcTemplate.query(sql, new UsersMapper(),DateFrom,DateTo);
               // .query(sql, new UserMapper(),DateFrom,DateTo);

    }
    
   //Accept Reject user from Event_Participant
    @Override
    public List<Users> getUsersByAcceptAndRejectEvent_participant(String DateFrom ,String DateTo) {
    
        String sql = "select name,count(rejected) as Event_rejected from event_participant where (created_on between ? and ? ) and rejected = '1' and is_viewed = '1' group by name";	
        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<Users>(Users.class),DateFrom , DateTo);
    }
    
  //SenderNumber eventCreated no ofReciepent
    @Override
    public List<Users> getUserByPhone_NumberEvent_CreatedAndNoOfReciepent() {
        String sql = "select  u.phone_number , r.event_id, e.created_on, count(r.event_id) as number_of_recipents from event_participant as r inner join event as e on e.id = r.event_id inner join user as u on e.created_by = u.id group by r.event_id";
        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<Users>(Users.class));
    }
  
    
   
}