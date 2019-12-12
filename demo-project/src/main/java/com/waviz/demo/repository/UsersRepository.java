package com.waviz.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.waviz.demo.model.Users;

@Repository("usersRepository")
public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	Users findByEmail(String email);

}
