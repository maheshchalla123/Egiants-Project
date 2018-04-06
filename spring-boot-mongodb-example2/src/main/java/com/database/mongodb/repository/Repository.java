package com.database.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.database.mongodb.model.user;

public interface Repository extends MongoRepository<user, String> {

	public user findUserByName(String name);
}
