package com.sumit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Employee;
import com.sumit.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/get")
	public List<Employee> getAllEmployee()
	{
		return  employeeService.fetchAllRecords();
	}
	
	@PostMapping(value = "/save")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return employeeService.saveobject(emp);
	}
	
	
}
