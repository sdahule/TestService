package com.example.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * @SpringBootApplication annotation replaces the 3 annotations in the springboot application.
 * They are @Configuration, @EnableAutoConfiguration, @ComponentScan
 * */
@SpringBootApplication
public class TestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
	}
	
	
}
