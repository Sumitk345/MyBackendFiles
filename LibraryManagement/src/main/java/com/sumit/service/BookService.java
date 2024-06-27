package com.sumit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.entity.Book;
import com.sumit.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	public List<Book> fetchAll() {
		return bookRepository.findAll();
	}

	public Book saveEntity(Book book) {
		return bookRepository.save(book);
		
	}

	public void deleteBook(int id) {
		bookRepository.deleteById(id);	
	}

}
