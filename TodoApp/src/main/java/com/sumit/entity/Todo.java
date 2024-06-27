package com.sumit.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Todo {

	@Id
	private int id;
	private String todoTitle;
	private String priority;
	
	@ManyToMany
	@JoinTable(name = "todo_employee" , joinColumns = @JoinColumn(name = "todo_id") ,inverseJoinColumns = @JoinColumn(name = "employee_id"))
	private Set<Employee> employees;

	public Todo() {}
	
	public Todo(int id, String todoTitle, String priority, Set<Employee> employees) {
		super();
		this.id = id;
		this.todoTitle = todoTitle;
		this.priority = priority;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTodoTitle() {
		return todoTitle;
	}

	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", todoTitle=" + todoTitle + ", priority=" + priority + ", employees=" + employees
				+ "]";
	}
	
	
	
}
