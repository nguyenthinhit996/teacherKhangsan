package com.an.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.an.dao.Usersdao;
import com.an.model.Users;

@Service("Userservice")
public class UserserviceImpl implements Userservice{

	
	@Autowired
	Usersdao dUsersdao;
	public List<Users> addUsers() {
		 return dUsersdao.selectAllUsers();
	}

}
