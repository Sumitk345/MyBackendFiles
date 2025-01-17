package com.sumit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.dto.EmployeePriority;
import com.sumit.dto.TodoProrityCount;
import com.sumit.entity.Employee;
import com.sumit.entity.Todo;
import com.sumit.service.EmployeeService;
import com.sumit.service.TodoService;

@RestController
@RequestMapping(value = "/api/todo")
public class TodoController {
	
	@Autowired
	private TodoService todoService;

	@GetMapping("/get")
	public List<Todo> getAlltodo()
	{
		return  todoService.fetchAllRecords();
	}
	
	@PostMapping(value = "/save")
	public Todo savetodo(@RequestBody Todo todo)
	{
		return todoService.saveobject(todo);
	}
	
	@PutMapping("/update/{id}")
	public Todo updatetodo(@PathVariable("id")int id,@RequestBody Todo todo)
	{
		return todoService.modifyDbRecordById(id, todo);
	}
	
	@GetMapping(value="/count/priority")
	public List<TodoProrityCount> getByTodoPriority()
	{
		return todoService.countByPriority();
	}
	
	@GetMapping(value="/priority/employee")
	public List<EmployeePriority> getEmployeeByPriority()
	{
		return todoService.employeeByPriority();
	}
	
	@GetMapping(value="/employee/{priority}")
	public List<EmployeePriority> getEmployeeByPriorityname(@PathVariable String priority)
	{
		return todoService.employeeByPriorityName(priority);
	}
	
}
