package com.sumit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Category;
import com.sumit.entity.Product;
import com.sumit.repository.CategoryRepository;
import com.sumit.repository.ProductRepository;

@RestController
@RequestMapping(value="/api/v1/product")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@PostMapping(value="/save")
	public Product saveProduct(@RequestBody Product product)
	{
		System.out.println(product);
		return productRepository.save(product);
	}

	@GetMapping(value="/show")
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	
	@GetMapping("/show/asc")
	public List<Product> getProductInAscendingOrder()
	{
		return productRepository.findAllByOrderByNameAsc();
	}
	
	@GetMapping("/show/byname/{name}")
	public Product getProductInAscendingOrder(@PathVariable("name") String name)
	{
		return productRepository.findByName(name);
	}
	
	@GetMapping("/show/categoryid/{id}")
	public List<Product> getByCategory(@PathVariable("id") int id)
	{
		
		return productRepository.findAllByCategoryId(id);
	}
	
	@GetMapping("/show/categoryname/{name}")
	public List<Product> getByCategoryName(@PathVariable("name") String name)
	{
		return productRepository.findAllByCategoryCategoryName(name);
	}
}
