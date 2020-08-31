package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	private ModelMapper modelMapper;

	public UserServiceImpl(UserDao userDao, ModelMapper modelMapper) {
		super();
		this.userDao = userDao;
		this.modelMapper = modelMapper;
	}

	@Override
	@Transactional
	public UserDto createNew(UserDto userDto) {
		// TODO Auto-generated method stub
		String str=UUID.randomUUID().toString();
        String str1[]=str.split("-");
        userDto.setUserId(str1[0]);
        
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        userDao.save(modelMapper.map(userDto, User.class));
		return userDto;
	}

	@Override
	@Transactional
	public UserDto updateExisting(UserDto userDto) {
		// TODO Auto-generated method stub
		Optional<User> user = userDao.findByUserNameAndPassword(userDto.getUserName(), userDto.getPassword());
		
		try {
			User newuser = user.get();
			newuser.setPassword(userDto.getPassword());
			
			if(!userDto.getEmail().isEmpty()) {
				newuser.setEmail(userDto.getEmail());
			}
			
			if(!userDto.getPhoneNumber().isEmpty()) {
				newuser.setPhoneNumber(userDto.getPhoneNumber());
			}
			return userDto;
		}
		catch(Exception e) {
			return new UserDto();
		}
	}

}
