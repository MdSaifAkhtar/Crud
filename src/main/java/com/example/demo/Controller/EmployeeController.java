package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/")
	public ResponseEntity<Employee> createUser( @RequestBody Employee emp)
	{
		this.service.AddEmployee(emp);
		 return new ResponseEntity<Employee>(HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getUser(@PathVariable("id") Integer id)
	{
		Employee selectEmployee = service.SelectEmployee(id);
		return new ResponseEntity<Employee>(selectEmployee,HttpStatus.OK);
	}
	

}
