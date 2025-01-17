package com.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sumit.entity.Book;
import com.sumit.repository.BookRepository;
import com.sumit.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("")
	public String getMethodName(Model model) {
		
		model.addAttribute("book", new Book());
		model.addAttribute("books",bookService.fetchAll());
		return "book";
	}
	
	@PostMapping("/save")
	public String SaveBook(@ModelAttribute Book book , Model model)
	{
		bookService.saveEntity(book);
		model.addAttribute("books",bookService.fetchAll());
		return "book";
		
	}
	
	@GetMapping("/delete")
	public String deleteBook(@RequestParam("id") int id, Model model) {
	    bookRepository.deleteById(id);
	    model.addAttribute("book", new Book());
	    model.addAttribute("books", bookRepository.findAll());
	    return "book";
	}
}
