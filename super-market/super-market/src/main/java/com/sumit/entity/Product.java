package com.sumit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@Column(name="product_id")
	private int id;
	
	@Column(name="prod_title")
	private String name;
	
	@Column(name="price")
	private float cost;

	@Column(name="disc_amount")
	private float discount;
	
	@ManyToOne()
	@JoinColumn(name="category_id")
	private Category category;
	
	public Product() {}

	public Product(int id, String name, float cost, float discount, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.category = category;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", discount=" + discount + ", category="
				+ category + "]";
	}

	
	
	
}
