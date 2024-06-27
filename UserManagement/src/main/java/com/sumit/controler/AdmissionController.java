package com.sumit.controler;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Admission;
import com.sumit.repository.AdmissionRepository;


@RestController
@RequestMapping(value = "/api/v1/admission")
public class AdmissionController {

	@Autowired
	AdmissionRepository admissionRepository;
	
	@GetMapping(value = "/get")
	public List<Admission> getAllAdmissions() {
		return admissionRepository.findAll();
	}
	
	@PostMapping(value = "/show")
	public Admission saveAdmission(@RequestBody Admission admission) {
	
		return admissionRepository.save(admission);
	}
}
