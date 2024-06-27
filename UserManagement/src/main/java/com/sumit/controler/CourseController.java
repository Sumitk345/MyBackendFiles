
package com.sumit.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Course;
import com.sumit.entity.Employee;
import com.sumit.repository.CourseRepository;
import com.sumit.repository.EmployeeRepository;

@RestController
@RequestMapping(value = "/api/v1/course")
public class CourseController {
	
	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping(value = "/get")
	public List<Course> getAllcourse() {
		return courseRepository.findAll();
	}
	
	@PostMapping(value = "/show")
	public Course savecourse(@RequestBody Course course) {
	
		return courseRepository.save(course);
	}

}
