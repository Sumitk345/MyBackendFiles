package com.sumit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CourseCategory {

	@Id
	private int id;
	
	private String courseCategory;
	
	public CourseCategory() {}

	public CourseCategory(int id, String courseCategory) {
		super();
		this.id = id;
		this.courseCategory = courseCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

	@Override
	public String toString() {
		return "CourseCategory [id=" + id + ", courseCategory=" + courseCategory + "]";
	}
	
	
}
