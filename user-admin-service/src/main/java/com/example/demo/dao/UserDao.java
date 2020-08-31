package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	
	public Optional<User> findByUserNameAndPassword(String userName, String password);
	public Optional<User> findByUserName(String userName);
	public Optional<User> findByUserId(String userId);
}
