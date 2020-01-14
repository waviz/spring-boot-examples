package com.waviz.jdbc.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	  @Override 
	  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	  {
	  
	  if("Admin".equals(username)) { 
		  return new User("Admin","$2a$10$H6GiBfnHSc2gkrqBI0dKEeSHjQsZkfOyg0IPexnHCtWJKpdLMYbLO",
	             new ArrayList<>()); 
	  } 
	  else { 
		  throw new UsernameNotFoundException("User not found with username: "+username); 
	  }
 }
}			
	
	
