package com.sumit.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.dto.EmployeePriority;
import com.sumit.dto.TodoProrityCount;
import com.sumit.entity.Employee;
import com.sumit.entity.Todo;
import com.sumit.repository.EmployeeRepository;
import com.sumit.repository.TodoRepository;

import jakarta.transaction.Transactional;

@Service
public class TodoService implements CrudOperations<Todo>{

	@Autowired
	private TodoRepository todoRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional
    public Todo saveobject(Todo todo) {
        Optional<Todo> existingTodoOpt = todoRepository.findById(todo.getId());

        if (existingTodoOpt.isPresent()) {
            Todo existingTodo = existingTodoOpt.get();

            Set<Employee> existingEmployees = existingTodo.getEmployees();
            Set<Employee> newEmployees = new HashSet<>();

            // Fetch each employee and add to the new employees set
            for (Employee emp : todo.getEmployees()) {
                Optional<Employee> existingEmployee = employeeRepository.findById(emp.getId());
                existingEmployee.ifPresent(newEmployees::add);
            }

            // Add new employees to the existing employees set
            existingEmployees.addAll(newEmployees);
            existingTodo.setEmployees(existingEmployees);

            // Update other fields if needed
            existingTodo.setTodoTitle(todo.getTodoTitle());
            existingTodo.setPriority(todo.getPriority());

            return todoRepository.save(existingTodo);
        } else {
            // If the Todo doesn't exist, create a new one
            Set<Employee> employees = new HashSet<>();
            for (Employee emp : todo.getEmployees()) {
                Optional<Employee> existingEmployee = employeeRepository.findById(emp.getId());
                existingEmployee.ifPresent(employees::add);
            }
            todo.setEmployees(employees);
            return todoRepository.save(todo);
        }
    }

	@Override
	public List<Todo> fetchAllRecords() {
		return todoRepository.findAll();
	}

	@Override
	public Todo getSingleRecord(int id) {
		return todoRepository.findById(id).get();
	}

	@Override
	public Todo modifyDbRecordById(int id, Todo object) {
		Todo todo = todoRepository.findById(id).get();
		
		todo.setPriority(object.getPriority());
		todo.setTodoTitle(object.getTodoTitle());
		todo.setEmployees(object.getEmployees());
		
		if(todo==null)
			return null;
		else
			return todoRepository.save(todo);
	}

	@Override
	public void deleteRecordById(int id) {
        Todo todo = todoRepository.findById(id).get();
		
		if(todo!=null)
			todoRepository.deleteById(id);
	}
	
	public List<TodoProrityCount> countByPriority()
	{
		return todoRepository.findCountByPriority();
	}
	
	public List<EmployeePriority> employeeByPriority()
	{
		return todoRepository.findemployeeBypriority();
	}
	
	public List<EmployeePriority> employeeByPriorityName(String priority)
	{
		return todoRepository.findemployeeBypriorityName(priority);
	}
}
