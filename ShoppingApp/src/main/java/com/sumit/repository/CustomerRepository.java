package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
