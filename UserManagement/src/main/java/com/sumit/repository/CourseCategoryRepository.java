package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.CourseCategory;

public interface CourseCategoryRepository extends JpaRepository<CourseCategory, Integer> {

}
