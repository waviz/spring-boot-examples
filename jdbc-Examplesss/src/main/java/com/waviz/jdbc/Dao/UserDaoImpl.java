package com.waviz.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//import com.waviz.jdbc.mapper.EventParticipantMapper;
import com.waviz.jdbc.mapper.UserMapper;
//import com.waviz.jdbc.model.EventParticipant;
import com.waviz.jdbc.model.User;

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
        List userList = jdbcTemplate
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
    
    //Create user b/e date
    @Override
    public List<User> getUserByCreated_on(String DateFrom ,String DateTo) {
    
        String sql = "SELECT * from user where created_on between ? and ?";
        List userList = jdbcTemplate
                .query(sql, new UserMapper(),DateFrom,DateTo);
        return userList;
    }

    //Create Event b/w date
    @Override
    public List<User> getUserByCreated_by(String DateFrom ,String DateTo) {
    
        String sql = "SELECT * FROM event e inner join user u on e.created_by = u.id where e.created_on between ? and ? group by created_by";
        List userList = jdbcTemplate
                .query(sql, new UserMapper(),DateFrom,DateTo);
        return userList;
    }
    
    //Active User b/w date
    @Override
    public List<User> getUserByStatusAndCreated_on(String DateFrom ,String DateTo) {
    
        String sql = "SELECT * FROM user where status = '1' and (created_on between ? and ?)";
        List userList = jdbcTemplate
                .query(sql, new UserMapper(),DateFrom,DateTo);
        return userList;
    }
    
    //Accept Reject user from Event_Participant
    @Override
    public List<User>getUserByEvent_participant(String DateFrom ,String DateTo) {
    
        String sql = "select * from event_participant e_p inner join user on e_p.phone_number = user.phone_number where e_p.created_on between ? and ? and rejected = '1' and is_viewed = '1' group by name";
        List userList = jdbcTemplate
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
}