package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.AuthResponse;
import com.cognizant.model.UserLoginCredential;
import com.cognizant.service.CustomerDetailsService;
import com.cognizant.service.JwtUtil;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private JwtUtil jwtutil;
	@Autowired
	private CustomerDetailsService custdetailservice;
	

	@GetMapping(path = "/health")
	public ResponseEntity<?> healthCheckup() {
		
		return new ResponseEntity<>("", HttpStatus.OK);
	}

	@PostMapping(value = "/login")
	public ResponseEntity<UserLoginCredential> login(@RequestBody UserLoginCredential userlogincredentials) {
		
		final UserDetails userdetails = custdetailservice.loadUserByUsername(userlogincredentials.getUid());
		if (userdetails.getPassword().equals(userlogincredentials.getPassword())) {
		
			return new ResponseEntity<>(new UserLoginCredential(userlogincredentials.getUid(),null,jwtutil.generateToken(userdetails)),HttpStatus.OK ); 
		} else {
			
			return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
		}
	}

	@GetMapping(value = "/validate")
	public ResponseEntity<AuthResponse> getValidity(@RequestHeader("Authorization") String token) {
		
		token = token.substring(7);
		AuthResponse res = new AuthResponse();
		if (jwtutil.validateToken(token)) {
			res.setUid(jwtutil.extractUsername(token));
			res.setValid(true);
		} else
			res.setValid(false);

		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

}
