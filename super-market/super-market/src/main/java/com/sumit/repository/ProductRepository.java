package com.sumit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Category;
import com.sumit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	//Jpa Naming Convention
	//findById()		findByCost()		findByDiscount()
	//orderByNameAsc()
	
	public List<Product> findAllByOrderByNameAsc();
	public Product findByName(String name);
	public List<Product> findAllByCategoryId(int id);
	public List<Product> findAllByCategoryCategoryName(String name);
	
}
