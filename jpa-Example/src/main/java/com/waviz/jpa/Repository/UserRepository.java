package com.waviz.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waviz.jpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

	
}
