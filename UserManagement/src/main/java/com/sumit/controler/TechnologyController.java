package com.sumit.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Enquiry;
import com.sumit.entity.Technology;
import com.sumit.repository.EnquiryRepository;
import com.sumit.repository.TechnologyRepository;

@RestController
@RequestMapping(value = "/api/v1/technology")
public class TechnologyController {

	@Autowired
	TechnologyRepository technologyRepository;
	
	@GetMapping(value = "/get")
	public List<Technology> getAllEnquiries() {
		return technologyRepository.findAll();
	}
	
	@PostMapping("/save")
	public Technology savetechnology(@RequestBody Technology technology) {
		return technologyRepository.save(technology);
	}
}
