package com.waviz.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.waviz.demo.config.JwtTokenUtil;
import com.waviz.demo.model.JwtRequest;
import com.waviz.demo.model.JwtResponse;
import com.waviz.demo.model.UsersDTO;
import com.waviz.demo.service.JwtUserDetailsService;

  @RestController
  @CrossOrigin
  public class JwtAuthenticationController {
	
  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private JwtTokenUtil jwtTokenUtil;

  @Autowired
  private JwtUserDetailsService userDetailsService;

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
         authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
  final UserDetails userDetails = userDetailsService
       .loadUserByUsername(authenticationRequest.getUsername());
  final String token = jwtTokenUtil.generateToken(userDetails);
     return ResponseEntity.ok(new JwtResponse(token));
  }

  @RequestMapping(value = "/signup", method = RequestMethod.POST)
   public ResponseEntity<?> saveUser(@RequestBody UsersDTO user) throws Exception {
	System.out.println(user);
	 return ResponseEntity.ok(userDetailsService.save(user));
   }
	    
  @RequestMapping({"/home"})  
    public String index(){
			 
    return"Welcome To User";  
  }
	

   private void authenticate(String username, String password) throws Exception {
      try {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
  }      
      catch (DisabledException e) {
         throw new Exception("USER_DISABLED", e);
    }
      catch (BadCredentialsException e) {
        throw new Exception("INVALID_CREDENTIALS", e);
    }
   }
 }


