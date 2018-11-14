package com.nithin.spring.app.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nithin.spring.app.ws.io.entity.UserEntity;
import com.nithin.spring.app.ws.io.repos.UserRepository;
import com.nithin.spring.app.ws.service.UserService;
import com.nithin.spring.app.ws.shared.Utils;
import com.nithin.spring.app.ws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	Utils utils;

	@Override
	public UserDto createUser(UserDto user) {
		
		if(userRepo.findByEmail(user.getEmail()) != null) throw new RuntimeException("User already exists");
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setEncryptedPassword("testEncryption");
		
		String publicUserId = utils.generateUserId(30);
		userEntity.setUserId(publicUserId);
		
		UserEntity savedUserDetails = userRepo.save(userEntity);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(savedUserDetails, returnValue);
		
		return returnValue;
	}
	
}