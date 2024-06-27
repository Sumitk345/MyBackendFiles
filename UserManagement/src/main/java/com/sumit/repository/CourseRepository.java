package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
