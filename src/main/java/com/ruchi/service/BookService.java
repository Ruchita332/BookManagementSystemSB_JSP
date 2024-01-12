package com.ruchi.service;

import java.util.List;

import com.ruchi.entity.Book;

public interface BookService {
	public boolean saveBook(Book book);
	public List<Book> getAllBook();
	public Book getBookById (int id);
	public boolean updateBook (Book book);
	public boolean deleteBook (int id);

}
