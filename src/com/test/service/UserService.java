package com.test.service;

import java.util.List;

import javax.annotation.Resource;

import com.test.dao.UserDAO;
import com.test.entity.User;

public class UserService {
	
	@Resource
	private UserDAO userDAO;
	
	public List<User> find(){
		return userDAO.find();
	}

}
