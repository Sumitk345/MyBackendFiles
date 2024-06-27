package com.sumit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer>{
	//			     <findAll><attribute_of_Bus_class><Attribute_of_Passenger
	public List<Bus> findAllByPassengersId(int id);
	public List<Bus> findAllByPassengersFirstName(String value);
}
