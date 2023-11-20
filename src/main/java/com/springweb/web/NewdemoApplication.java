package com.springweb.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springweb.web.dao.UserRepository;
import com.springweb.web.entities.User;

@SpringBootApplication
public class NewdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewdemoApplication.class, args);
//		UserRepository userRepository=  Context.getBean(UserRepository.class);
//		User user=new User();
//		user.setName("Ravish Kumar");
//		user.setCity("Bangalore");
//		user.setStatus("I am a traveller");
//		User user1=userRepository.save(user);
//		System.out.print(user1);
	}
	//ApplicationContext Context=

}
