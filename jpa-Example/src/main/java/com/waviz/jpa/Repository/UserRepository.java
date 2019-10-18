package com.waviz.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waviz.jpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

	
}
