package com.stareng.crudstareng.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stareng.crudstareng.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User us = new User(1L, "Thiago Trolle", "thiago@email.com", "982165189", "12345678");
		return ResponseEntity.ok().body(us);	
	}
	
}
