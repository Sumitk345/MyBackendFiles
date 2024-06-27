package com.sumit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Passenger;
import com.sumit.repository.PassengerRepository;

@RestController
@RequestMapping("/api/v1/passenger")
public class PassengerController {
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	@PostMapping("/save")
	public Passenger saveNewPassenger(@RequestBody Passenger passenger) 
	{
		return passengerRepository.save(passenger);
	}
	
	@GetMapping(value="/order/firstname")
	public List<Passenger> getPassengerNamesInAsc()
	{
		return passengerRepository.findAllByOrderByFirstName();
	}
	
	@GetMapping(value="/busId/{id}")
	public List<Passenger> getPassengerNamesByBusId(@PathVariable("id")int id)
	{
		return passengerRepository.findAllByBusId(id);
	}
	
	@GetMapping(value="/busName/{name}")
	public List<Passenger> getPassengerNamesByBusRegistration(@PathVariable("name")String name)
	{
		return passengerRepository.findAllByBusBusRegistration(name);
	}
	
	@GetMapping(value="/order/age")
	public List<Passenger> getPassengerAgeInDesc()
	{
		return passengerRepository.findAllByOrderByAgeDesc();
	}
	
	@GetMapping(value="/age/between")
	public List<Passenger> getAgeBetween(@RequestParam("start") int start, @RequestParam("end")int end)
	{
		return passengerRepository.findByAgeBetween(start, end);
	}
	
	@GetMapping(value="/count")
	public Long getTotalPassengers()
	{
		return passengerRepository.count();
	}
	
	@GetMapping(value="/firstname/{prefix}")
	public List<Passenger> getPassengersContains(@PathVariable("prefix") String prefix)
	{
		return passengerRepository.findByFirstNameContaining(prefix);
	}
}
