package com.sumit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Actor;
import com.sumit.repository.ActorRepository;

@RestController
@RequestMapping(value = "/api/v1/actor")
public class ActorController {

	@Autowired
	ActorRepository actorRepository;
	
	@GetMapping(value = "/show")
	public List<Actor> getactordetails()
	{
		System.out.println(actorRepository.findAll());
		return actorRepository.findAll();
	}
	
	
	@GetMapping(value = "/show/{id}")
	public Optional<Actor> getactordetailsById(@PathVariable("id") int id)
	{
		return actorRepository.findById(id);
	}
	
	@GetMapping(value = "/show/firstname/{name}")
	public List<Actor> getsingleactor(@PathVariable("name") String name) {
		 return actorRepository.findByFirstname(name);
	}
	
	@GetMapping(value = "/show/lastname/{name}")
	public List<Actor> getsingleactordetails(@PathVariable("name") String name) {
		 return actorRepository.findByLastname(name);
	}
}
