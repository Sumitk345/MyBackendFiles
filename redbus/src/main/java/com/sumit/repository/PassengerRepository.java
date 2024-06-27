package com.sumit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{
	public List<Passenger> findAllByBusId(int id);
	public List<Passenger> findAllByBusBusRegistration(String name);
	public List<Passenger> findAllByOrderByFirstName();
	public List<Passenger> findAllByOrderByAgeDesc();
	public List<Passenger> findByAgeBetween(int start, int end);
	public List<Passenger> findByFirstNameContaining(String prefix);
}
