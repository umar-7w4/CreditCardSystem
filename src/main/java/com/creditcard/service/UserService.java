package com.creditcard.service;

import java.util.List;

import com.creditcard.entities.User;


public interface UserService {
	

	public User addUser(User user);

	public User getUser();

	public User getUserById(Integer userId);

}

