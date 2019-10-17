package com.waviz.jdbc.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.waviz.jdbc.mapper.UserMapper;
import com.waviz.jdbc.model.User;

@Repository
public class UserDaoImpl implements UserDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<User> getAllUsers()
    {
        String sql = "select id,name,password,email from users";
        List userList = jdbcTemplate
                .query(sql, new UserMapper());
        return userList;
    }

    @Override
    public User getUserById(int id)
    {
        String sql = "select id, name, password, email from users where id =?";
        User user = jdbcTemplate
                .queryForObject(sql, new UserMapper(), id);
        return user;
    }

    @Override
    public void insertUser(User user)
    {
        String sql = "insert into users (id, name, password, email) values (?, ?, ?, ?)";
        jdbcTemplate.update(sql, user.getId(), user.getName(), user.getPassword(), user.getEmail());
    }

    @Override
    public void updateUser(User user)
    {
        String sql = "update Users set name = ?, password = ?, email = ? where id = ?";
        jdbcTemplate.update(sql, user.getName(), user.getPassword(), user.getEmail(), user.getId());
    }

    @Override
    public void deleteUser(int id)
    {
        String sql = "delete from Users where id = ?";
        jdbcTemplate.update(sql, id);
    }
}