package com.bharath.ydemo.springbootwithrest;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.ydemo.springbootwithrest.model.Employee;
import com.bharath.ydemo.springbootwithrest.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootwithrestApplicationTests {

	@Autowired
	EmployeeService employeeService;
	

	@Test
	public void contextLoads() {
	}
	@Test
	public void getEmployeeListTest() {
	
		List<Employee> empList = employeeService.getEmployeeList();
		
		assertFalse(empList != null);
	}
}
