package com.sumit.entity;

import java.util.Set;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Bus {
	@Id
	private int id;
	private String busType;
	private String busRegistration;
	@Column(nullable = false)
	private int totalSeats;

	@ManyToMany
	@JoinTable(
			name = "bus_passenger", 
			joinColumns = @JoinColumn(name = "bus_id"), 
			inverseJoinColumns = @JoinColumn(name = "passenger_id"))
	Set <Passenger>passengers;

	public Bus() {
	}


	public Bus(int id, String busType, String busRegistration, int totalSeats, Set<Passenger> passengers) {
		super();
		this.id = id;
		this.busType = busType;
		this.busRegistration = busRegistration;
		this.totalSeats = totalSeats;
		this.passengers = passengers;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBusType() {
		return busType;
	}


	public void setBusType(String busType) {
		this.busType = busType;
	}


	public String getBusRegistration() {
		return busRegistration;
	}


	public void setBusRegistration(String busRegistration) {
		this.busRegistration = busRegistration;
	}


	public int getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}


	public Set<Passenger> getPassengers() {
		return passengers;
	}


	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}


	@Override
	public String toString() {
		return "Bus [id=" + id + ", busType=" + busType + ", busRegistration=" + busRegistration + ", totalSeats="
				+ totalSeats + ", passengers=" + passengers + "]";
	}

}
