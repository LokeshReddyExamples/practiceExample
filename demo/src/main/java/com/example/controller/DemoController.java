package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDao;
import com.mongodb.DBObject;

@RestController
public class DemoController {

	@Autowired
	private UserDao userDao;
	
	
	@RequestMapping("/getData")  
    public List<DBObject> getUserDetails(){ 
		userDao.getDetails();
		return userDao.getDetails();
    }
	
}
