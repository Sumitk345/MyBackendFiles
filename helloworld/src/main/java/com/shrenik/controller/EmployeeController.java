package com.shrenik.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shrenik.entity.Employee;

@RestController
@RequestMapping(value="/api/v1")
public class EmployeeController {

	List<Employee> employees = Arrays.asList(new Employee(283, "Smith", "smith@website.com", "INDIA"),
			new Employee(284, "John", "john@website.com", "UAE"),
			new Employee(285, "James", "james@website.com", "USA"),
			new Employee(286, "Peter", "peter@website.com", "INDIA"));

	@RequestMapping(value="/message/show", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello World";
	}

	@GetMapping(value = "/users/all")
	public List<Employee> getAllEmploee() {

		return employees;
	}

	@GetMapping(value = "/users/{id}")
	public Employee getSingleEmployee(@PathVariable("id") int id) {
		for(Employee item:employees)
		{
			if(item.getId()==id)
				return item;
		}
		return null;
	}
}


/*
 Task1
 Api End Point : "/count/location"
 Response: 
 {
   "INDIA":2,
   "UAE":1,
   "USA":1
 } 
 
 
 
 Task2
 Api End Point : /product/most
 Response:
 [
    {
       id:1,
       title:"Mouse",
       description:"top most product in wireless mouse",
       cost:"$500"
    },
    
    {
           id:8,
       title:"Speaker",
       description:"boss x series most favorite speaker",
       cost:"$500"
    }
 ]
 
 
 
 */










