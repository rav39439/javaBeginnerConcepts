package com.springweb.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.springweb.web.entities.User;



public interface UserRepository extends CrudRepository<User,Integer> {
	
	
	

}
