package com.an.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.an.model.Users;
import com.an.service.Userservice;

@RestController
public class UserController {
	
	@Autowired
	Userservice userservice;
	
	@RequestMapping(value="/user/", method=RequestMethod.GET)
	public ResponseEntity<List<Users>> allUser(){
		List<Users> users=userservice.addUsers();
		return new ResponseEntity<List<Users>>(users,HttpStatus.OK);
	}
}
