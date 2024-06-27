package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
