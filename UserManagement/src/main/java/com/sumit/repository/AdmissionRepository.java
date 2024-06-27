package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Admission;

public interface AdmissionRepository extends JpaRepository<Admission, Integer>{

}
