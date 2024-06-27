package com.sumit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Actor {

	@Id
	private int actor_id;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "last_name")
	private String lastname;
	
	private String last_update;

	public Actor() {}
	
	public Actor(int actor_id, String first_name, String last_name, String last_update) {
		super();
		this.actor_id = actor_id;
		this.firstname = first_name;
		this.lastname = last_name;
		this.last_update = last_update;
	}

	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	public String getFirst_name() {
		return firstname;
	}

	public void setFirst_name(String first_name) {
		this.firstname = first_name;
	}

	public String getLast_name() {
		return lastname;
	}

	public void setLast_name(String last_name) {
		this.lastname = last_name;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "DataInfo [actor_id=" + actor_id + ", first_name=" + firstname + ", last_name=" + lastname
				+ ", last_update=" + last_update + "]";
	}
	
}
