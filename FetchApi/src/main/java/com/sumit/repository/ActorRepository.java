package com.sumit.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Actor;
import java.util.List;
import java.util.Optional;



public interface ActorRepository extends JpaRepository<Actor, Integer> {
	
	public Optional<Actor> findById(int id);
	public List<Actor> findByFirstname(String firstName);
	public List<Actor> findByLastname(String lastName);
}
