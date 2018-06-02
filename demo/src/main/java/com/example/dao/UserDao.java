package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.util.MongoManager;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

@Repository
public class UserDao {

	@Autowired
	private MongoManager manager;

	public List<DBObject> getDetails(){

		List<DBObject> dbObjects = new ArrayList<DBObject>();
		DB db = manager.getConnection().getDB("pickcel");
		DBCollection col = db.getCollection("users");
		DBCursor curser=col.find();
		while (curser.hasNext()) {
			dbObjects.add(curser.next());
		}

		return dbObjects;	

	}

}
