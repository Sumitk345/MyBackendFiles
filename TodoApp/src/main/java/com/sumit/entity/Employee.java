package com.sumit.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int id;
	private String empName;
	private String role;
	private long salary;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "employees")
	private Set<Todo> todos;

	public Employee() {}
	
	
	public Employee(int id, String empName, String role, long salary, Set<Todo> todos) {
		super();
		this.id = id;
		this.empName = empName;
		this.role = role;
		this.salary = salary;
		this.todos = todos;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public Set<Todo> getTodos() {
		return todos;
	}


	public void setTodos(Set<Todo> todos) {
		this.todos = todos;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", role=" + role + ", salary=" + salary + ", todos="
				+ todos + "]";
	}
	
	
	
}
