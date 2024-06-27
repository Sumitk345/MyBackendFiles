package com.sumit.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Employee;
import com.sumit.entity.Enquiry;
import com.sumit.repository.EnquiryRepository;

@RestController
@RequestMapping(value = "/api/v1/enquiry")
public class EnquiryController {

	@Autowired
	EnquiryRepository enquiryRepository;
	
	@GetMapping(value = "/get")
	public List<Enquiry> getAllEnquiries() {
		return enquiryRepository.findAll();
	}
	
	@PostMapping("/save")
	public Enquiry saveEnquiry(@RequestBody Enquiry enquiry) {
		return enquiryRepository.save(enquiry);
	}
}
