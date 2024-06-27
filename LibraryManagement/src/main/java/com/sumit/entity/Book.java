package com.sumit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	private int id;
	private String bookName;
	private float cost;
	private int totalPages;
	
	public Book() {}

	public Book(int id, String bookName, float cost, int totalPages) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.cost = cost;
		this.totalPages = totalPages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", cost=" + cost + ", totalPages=" + totalPages + "]";
	}
	
	
	
}
