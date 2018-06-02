package com.example.util;

import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;

@Component
public class MongoManager {
	
	
	public MongoClient getConnection(){
		MongoClient mongo = new MongoClient("192.168.2.22", 27017);
		return mongo;
	}
	

}
