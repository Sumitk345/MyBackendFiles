package com.sumit.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Bus;
import com.sumit.entity.Passenger;
import com.sumit.repository.BusRepository;

@RestController
@RequestMapping(value="/api/v1/bus")
public class BusController {
		
	@Autowired
	private BusRepository busRepository;
	
	@PostMapping(value="/save")
	public Bus createNewBus(@RequestBody Bus newBusData) {
	    // Fetch the existing Bus entity from the database
	    Optional<Bus> existingBusOptional = busRepository.findById(newBusData.getId());
	    
	    if (existingBusOptional.isPresent()) {
	        Bus existingBus = existingBusOptional.get();
	        
	        // Get the existing set of passengers
	        Set<Passenger> existingPassengers = existingBus.getPassengers();
	        
	        // Merge the new passengers with the existing passengers
	        existingPassengers.addAll(newBusData.getPassengers());
	        
	        // Set the merged passengers back to the Bus entity
	        existingBus.setPassengers(existingPassengers);
	        
	        // Update other Bus fields if necessary
	        existingBus.setBusType(newBusData.getBusType());
	        existingBus.setBusRegistration(newBusData.getBusRegistration());
	        existingBus.setTotalSeats(newBusData.getTotalSeats());
	        
	        // Save the Bus entity with the updated passengers
	        return busRepository.save(existingBus);
	    } else {
	        // If the Bus does not exist, create a new one
	        return busRepository.save(newBusData);
	    }
	}

	
	@GetMapping(value="/get")
	public List<Bus> getAllBus()
	{
		return busRepository.findAll();
	}
	
	@GetMapping("/passenger/{id}")
	public List<Bus> getByPassngerId(@PathVariable("id") int _id)
	{
		return busRepository.findAllByPassengersId(_id);
	}
	
	@GetMapping("/passenger/byName/{name}")
	public List<Bus> getByPassngerFirstName(@PathVariable("name") String _firstName)
	{
		return busRepository.findAllByPassengersFirstName(_firstName);
	}
}
