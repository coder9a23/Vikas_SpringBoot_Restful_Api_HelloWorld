package com.gl.springrestApi.BasicSpringRestApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springrestApi.BasicSpringRestApi.dao.EmployeeDao;

@Service
public class service {
	@Autowired
	EmployeeDao employeeDao;
	public List getEmployeesSvc() {
		return employeeDao.getEmployee();
	}
}
