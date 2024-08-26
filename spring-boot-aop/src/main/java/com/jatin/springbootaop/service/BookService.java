package com.jatin.springbootaop.service;

import org.springframework.stereotype.Service;

import com.jatin.springbootaop.model.Book;

@Service
public class BookService {

	public Book addBook(String title, String bookid) {
		Book book = new Book(bookid, title);
		System.out.println("Inside add book :");
		return book;

	}

	public void deletBook(String bookid) {
		System.out.println("Deleting Book with id :" + bookid);
	}

}
