package com.stareng.crudstareng.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stareng.crudstareng.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
