package com.sumit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Category;
import com.sumit.repository.CategoryRepository;

@RestController
@RequestMapping(value="/api/v1/category")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping(value="/show")
	public List<Category> getAll()
	{
		return categoryRepository.findAll();
	}
	
	@PostMapping(value="/save")
	public Category save(@RequestBody Category category)
	{
		return categoryRepository.save(category);
	}
}
