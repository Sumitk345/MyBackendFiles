package com.sumit.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.CourseCategory;
import com.sumit.entity.Employee;
import com.sumit.repository.CourseCategoryRepository;
import com.sumit.repository.EmployeeRepository;

@RestController
@RequestMapping(value = "/api/v1/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping(value = "/get")
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	@PostMapping(value = "/show")
	public Employee saveEmployee(@RequestBody Employee employee) {
	
		return employeeRepository.save(employee);
	}
}
