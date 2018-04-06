package com.database.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.database.mongodb.model.user;
import com.database.mongodb.repository.Repository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	Repository userRepository;
	
	
	@RequestMapping(method=RequestMethod.POST,consumes= {"application/json","application/xml"})
	public void create(@RequestBody user user) {
		userRepository.save(user);
	}
	@RequestMapping(value="/{id}")
	public user read(@PathVariable String id) {
		return userRepository.findOne(id);
	}
	@RequestMapping(method=RequestMethod.PUT,consumes= {"application/json","application/xml"})
	public void update(user user) {
		userRepository.save(user);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(String id) {
		userRepository.delete(id);
		
	}

}
