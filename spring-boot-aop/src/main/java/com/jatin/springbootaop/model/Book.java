package com.jatin.springbootaop.model;

public class Book {

	private String bookid;
	private String title;

	public Book() {
	}

	public Book(String bookid, String title) {
		this.bookid = bookid;
		this.title = title;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + "]";
	}

}
