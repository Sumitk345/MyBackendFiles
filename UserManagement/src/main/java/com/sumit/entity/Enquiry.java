package com.sumit.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Enquiry {

	@Id
	private int id;
	
	private String batchtime;
	
	private String college;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	
	private String education;
	
	private String status;
	
	@ManyToOne
	@JoinColumn()
	private Course course;
	
	@ManyToOne
	@JoinColumn()
	private UserAccount userAccount;

	public Enquiry () {}
	
	public Enquiry(int id, String batchtime, String college, Date date, String education, String status, Course course,
			UserAccount userAccount) {
		super();
		this.id = id;
		this.batchtime = batchtime;
		this.college = college;
		this.date = date;
		this.education = education;
		this.status = status;
		this.course = course;
		this.userAccount = userAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBatchtime() {
		return batchtime;
	}

	public void setBatchtime(String batchtime) {
		this.batchtime = batchtime;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@Override
	public String toString() {
		return "Enquiry [id=" + id + ", batchtime=" + batchtime + ", college=" + college + ", date=" + date
				+ ", education=" + education + ", status=" + status + ", course=" + course + ", userAccount="
				+ userAccount + "]";
	}
	
	
	
}
