package com.sumit.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Admission;
import com.sumit.entity.CourseCategory;
import com.sumit.repository.AdmissionRepository;
import com.sumit.repository.CourseCategoryRepository;

@RestController
@RequestMapping(value = "/api/v1/coursecategory")
public class CourseCategoryController {

	@Autowired
	CourseCategoryRepository courseCategoryRepository;
	
	@GetMapping(value = "/get")
	public List<CourseCategory> getAllcourseCategory() {
		return courseCategoryRepository.findAll();
	}
	
	@PostMapping(value = "/show")
	public CourseCategory savecourseCategory(@RequestBody CourseCategory courseCategory) {
	
		return courseCategoryRepository.save(courseCategory);
	}
}
