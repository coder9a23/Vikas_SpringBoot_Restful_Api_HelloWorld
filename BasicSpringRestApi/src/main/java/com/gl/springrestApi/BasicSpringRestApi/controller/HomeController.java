package com.gl.springrestApi.BasicSpringRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.springrestApi.BasicSpringRestApi.dao.EmployeeDao;

@RestController
@RequestMapping("/hello")
public class HomeController {
	
	@Autowired
	EmployeeDao empService;
	
	@RequestMapping("/greet")
	public String sayHello() {
		return "Welcome to Spring Boot Api with Simulated data";
	}
	
	@GetMapping("/employees")
	public List getEmployee() {
		return empService.getEmployee();
	}

}
