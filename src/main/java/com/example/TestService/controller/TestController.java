package com.example.TestService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestService.entitiy.Customer;
import com.example.TestService.repository.CustomerRepository;

@RestController
public class TestController {
	
	@Autowired
	CustomerRepository repo;
	
	@GetMapping("/test")
	public List<Customer> testService() {
		return repo.findAll();
	}


	@GetMapping("/health")
	public String testHealth(){
		return "Health ok!!";
	}

	@PostMapping("/insert")
	public void insertdata(){
		
	}
}
