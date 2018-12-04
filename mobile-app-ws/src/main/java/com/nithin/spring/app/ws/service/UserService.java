package com.nithin.spring.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.nithin.spring.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto userDto);
	UserDto getUser(String email);
}