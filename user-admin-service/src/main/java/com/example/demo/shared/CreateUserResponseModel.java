package com.example.demo.shared;

public class CreateUserResponseModel {
	
	private String userName;
	private String userType;
	private String email;
	private String phoneNumber;
	public CreateUserResponseModel(String userName, String userType, String email, String phoneNumber) {
		super();
		this.userName = userName;
		this.userType = userType;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	
}
