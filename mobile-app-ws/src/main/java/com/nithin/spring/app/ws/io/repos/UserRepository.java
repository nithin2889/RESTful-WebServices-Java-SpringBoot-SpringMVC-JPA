package com.nithin.spring.app.ws.io.repos;

import org.springframework.data.repository.CrudRepository;

import com.nithin.spring.app.ws.io.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}