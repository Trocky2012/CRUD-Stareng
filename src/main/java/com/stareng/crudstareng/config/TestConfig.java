package com.stareng.crudstareng.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.stareng.crudstareng.entities.User;
import com.stareng.crudstareng.repositories.UserRepository;

@Configuration
@Profile("test")
//"test" deve ter mesma notação utilizada em package: src/main/resources -> application.properties
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
		User u1 = new User(null, "Thiago Trolle", "thiago@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Aline Scheffer", "aline@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
}
