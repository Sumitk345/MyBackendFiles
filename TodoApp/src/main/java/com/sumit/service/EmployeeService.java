package com.sumit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.entity.Employee;
import com.sumit.repository.EmployeeRepository;

@Service
public class EmployeeService implements CrudOperations<Employee>{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveobject(Employee object) {
		return employeeRepository.save(object);
	}

	@Override
	public List<Employee> fetchAllRecords() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getSingleRecord(int id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee modifyDbRecordById(int id, Employee object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRecordById(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
