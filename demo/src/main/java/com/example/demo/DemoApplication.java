package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.mongodb.MongoClient;


@ComponentScan("com.example") 
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Start of main");
		SpringApplication.run(DemoApplication.class, args);
	}
}
