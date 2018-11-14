package com.nithin.spring.app.ws.service;

import com.nithin.spring.app.ws.shared.dto.UserDto;

public interface UserService {
	UserDto createUser(UserDto userDto);
}