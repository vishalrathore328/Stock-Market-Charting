package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity, Integer>{
	
	public Optional<UserEntity> findByUserNameAndPassword(String userName, String password);
	public Optional<UserEntity> findByUserName(String userName);
	public UserEntity findByUserId(String userId);
	public UserEntity findByEmail(String email);
}
