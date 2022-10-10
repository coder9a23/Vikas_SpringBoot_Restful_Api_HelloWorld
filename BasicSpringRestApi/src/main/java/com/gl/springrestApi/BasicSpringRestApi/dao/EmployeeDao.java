package com.gl.springrestApi.BasicSpringRestApi.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.springrestApi.BasicSpringRestApi.entity.Employee;

@Repository
public class EmployeeDao {

	ArrayList<Employee> employee;

	public EmployeeDao() {
		employee = new ArrayList<Employee>();
		employee.add(new Employee("E001","Harsh","RTNagar"));
		employee.add(new Employee("E002","Vidhut","Office line"));
		employee.add(new Employee("E003","Aman","Sector 201"));
		employee.add(new Employee("E004","Ritik","Rajender Nagar"));
		employee.add(new Employee("E005","Chetan","Ratlam"));
	}
	
	public List getEmployee() {
		return employee;
	}
}
