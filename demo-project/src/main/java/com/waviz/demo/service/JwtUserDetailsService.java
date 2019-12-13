package com.waviz.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.waviz.demo.model.Users;
import com.waviz.demo.model.UsersDTO;
import com.waviz.demo.repository.UsersRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Users user = usersRepository.findByEmail(email);
		
		if (user == null) {
			throw new UsernameNotFoundException("User not found with email: " + email);
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				new ArrayList<>());
	}
	public Users save(UsersDTO user) {
		Users newUser = new Users();
		newUser.setFirstname(user.getFirstname());
		newUser.setLastname(user.getLastname());
		newUser.setEmail(user.getEmail());
		newUser.setOtp(user.getOtp());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		return usersRepository.save(newUser);
	}

}
	
	/*
	 * @Override public UserDetails loadUserByUsername(String username) throws
	 * UsernameNotFoundException{
	 * 
	 * if("user".equals(username)) { return new
	 * User("user","$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
	 * new ArrayList<>()); } else { throw new
	 * UsernameNotFoundException("User not found with username: "+username); }
	 */
				
	
	
