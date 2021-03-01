package com.stareng.crudstareng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.stareng.crudstareng")
public class CrudStarengApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudStarengApplication.class, args);
	}
}
