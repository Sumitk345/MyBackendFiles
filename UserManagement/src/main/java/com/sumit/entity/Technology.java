package com.sumit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Technology {

	@Id
	private int id;
	
	private String technology;
	
	@ManyToOne
	@JoinColumn()
	private CourseCategory courseCategory;
	
	public Technology() {}


	public Technology(int id, String technology, CourseCategory courseCategory) {
		super();
		this.id = id;
		this.technology = technology;
		this.courseCategory = courseCategory;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public CourseCategory getCoursecategory() {
		return courseCategory;
	}

	public void setCoursecategory(CourseCategory coursecategory) {
		this.courseCategory = coursecategory;
	}

	@Override
	public String toString() {
		return "Technology [id=" + id + ", technology=" + technology + ", coursecategory=" + courseCategory + "]";
	}
	
	
}
