package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
