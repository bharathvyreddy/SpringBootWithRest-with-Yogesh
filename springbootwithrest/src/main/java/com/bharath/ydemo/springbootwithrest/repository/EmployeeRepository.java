package com.bharath.ydemo.springbootwithrest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bharath.ydemo.springbootwithrest.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
}
