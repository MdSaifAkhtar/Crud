package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	
	public void AddEmployee(Employee emp) {
		repo.save(emp);	
	}
	
	public Employee SelectEmployee(int id) {
	Employee newemp = repo.findById(id).get();
		 return newemp;	
	}
	
}

