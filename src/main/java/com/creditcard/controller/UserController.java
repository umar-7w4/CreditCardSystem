package com.creditcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditcard.entities.User;
import com.creditcard.service.UserService;

@RestController
@RequestMapping("/api/User")
public class UserController {
	@Autowired
	UserService userService;
	
	 @PostMapping("/adduser")
	    public User addUser(@RequestBody User user){
	        return userService.addUser(user);
	    }
	 
	 @GetMapping("/getuser")
	    public User getUser(){
	        return userService.getUser();
	    }
	
	@GetMapping("/getuser/{id}")
	public ResponseEntity<User> getUser(
			@PathVariable("userId")Integer userId){
		User user= userService.getUserById(userId);
		if(user==null) {
			return new ResponseEntity("Sorry! User not found!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}



}
