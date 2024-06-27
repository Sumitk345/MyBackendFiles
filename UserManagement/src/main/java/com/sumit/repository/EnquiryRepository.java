package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Enquiry;

public interface EnquiryRepository  extends JpaRepository<Enquiry, Integer>{

}
