package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}
