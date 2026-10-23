package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController("")
public class EmployeeController 
{
	
	@Autowired
	EmployeeRepository employeeRepository;
	@RequestMapping("/api/v1/")
	public List<Employee> getAllDetails()
	{
		return employeeRepository.findAll();
	}

}
