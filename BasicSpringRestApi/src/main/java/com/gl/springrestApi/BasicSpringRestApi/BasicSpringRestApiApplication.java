package com.gl.springrestApi.BasicSpringRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.gl.springrestApi.BasicSpringRestApi",
		"com.gl.springrestApi.BasicSpringRestApi.controller", "com.gl.springrestApi.BasicSpringRestApi.dao",
		"com.gl.springrestApi.BasicSpringRestApi.service", "com.gl.springrestApi.BasicSpringRestApi.entity" })
public class BasicSpringRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringRestApiApplication.class, args);
		System.out.println("Hello World");
	}

}
