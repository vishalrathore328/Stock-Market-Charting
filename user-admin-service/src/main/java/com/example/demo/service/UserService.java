package com.example.demo.service;

import com.example.demo.dto.UserDto;

public interface UserService {
	
	public UserDto createNew(UserDto userDto);
	public UserDto updateExisting(UserDto userDto);
}
