package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/users")
	public ResponseEntity<UserDto> createNew(@RequestBody UserDto userDto){
		
		return new ResponseEntity<UserDto> (userService.createNew(userDto), HttpStatus.CREATED);
	}
	
	public ResponseEntity<UserDto> updateExisting(@RequestBody UserDto userDto){
		
		return new ResponseEntity<UserDto> (userService.updateExisting(userDto), HttpStatus.OK);
	}
}
