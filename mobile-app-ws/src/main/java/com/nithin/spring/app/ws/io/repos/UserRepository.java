package com.nithin.spring.app.ws.io.repos;

import org.springframework.data.repository.CrudRepository;

import com.nithin.spring.app.ws.io.entity.UserEntity;

/**
 * This repository takes the UserEntity class and will persist the data into a
 * database
 * 
 * @author Nithin
 *
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
}