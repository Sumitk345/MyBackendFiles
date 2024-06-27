package com.shrenik.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	public int id;
	public String username;
	public String email;
	public String location;
	
	
	
	public Employee() {}
	
	public Employee(int id, String username, String email, String location) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", email=" + email + ", location=" + location + "]";
	}
	
	
	
	
}
