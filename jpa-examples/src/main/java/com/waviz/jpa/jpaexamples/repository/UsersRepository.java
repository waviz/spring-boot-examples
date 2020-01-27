package com.waviz.jpa.jpaexamples.repository;

import  com.waviz.jpa.jpaexamples.model.Users;
import  org.springframework.data.jpa.repository.JpaRepository;
import  org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>
{
 //@Query("select u from users U where u.id = ?1")
 //List<Users> findById(int id);
}