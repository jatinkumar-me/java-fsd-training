package com.jatin.springbootaop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jatin.springbootaop.model.Book;
import com.jatin.springbootaop.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/add/book", method = RequestMethod.POST)
	public Book addBook(@RequestParam("title") String title, @RequestParam("bookid") String bookid) {
		return bookService.addBook(title, bookid);
	}

	@RequestMapping(value = "/remove/book", method = RequestMethod.DELETE)
	public String removeBook(@RequestParam("bookid") String bookid) {
		return "book removed :" + bookid;
	}

}
