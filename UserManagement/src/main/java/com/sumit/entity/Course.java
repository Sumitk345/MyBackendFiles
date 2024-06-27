package com.sumit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {

	@Id
	private int id;
	
	private String course;
	
	private int duration;
	
	private double fees;
	
	private String status;
	
	@ManyToOne
	@JoinColumn()
	private Technology technology;
	
	public Course() {}

	public Course(int id, String course, int duration, double fees, String status, Technology technology) {
		super();
		this.id = id;
		this.course = course;
		this.duration = duration;
		this.fees = fees;
		this.status = status;
		this.technology = technology;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", duration=" + duration + ", fees=" + fees + ", status="
				+ status + ", technology=" + technology + "]";
	}
	
	
}
