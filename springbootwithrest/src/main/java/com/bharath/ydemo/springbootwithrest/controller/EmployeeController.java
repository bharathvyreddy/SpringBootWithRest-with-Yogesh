package com.bharath.ydemo.springbootwithrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.ydemo.springbootwithrest.model.Employee;
import com.bharath.ydemo.springbootwithrest.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("This is employee Controller")
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@ApiOperation(value="This will get a list of all employees",notes="Notes")
	@RequestMapping("employee")
	public List<Employee> getEmployeeList(){
		return employeeService.getEmployeeList();
	}
	
}
