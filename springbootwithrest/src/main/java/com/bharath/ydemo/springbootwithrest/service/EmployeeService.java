package com.bharath.ydemo.springbootwithrest.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.ydemo.springbootwithrest.model.Employee;
import com.bharath.ydemo.springbootwithrest.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	public List<Employee> getEmployeeList(){
		
		return (List<Employee>) employeeRepository.findAll();
	}
}