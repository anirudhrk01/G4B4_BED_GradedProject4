package com.greatlearning.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.greatlearning.springboot.dto.UserRegistrationDto;
import com.greatlearning.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
