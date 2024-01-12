package com.ruchi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruchi.entity.Book;
import com.ruchi.repo.BookRepo;
import com.ruchi.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepo daoImpl;

	@Override
	public boolean saveBook(Book book) {
		// TODO Auto-generated method stub
		Book saveBook= daoImpl.save(book);
		
		if (saveBook != null) {
			//Book successfully save into database
			return true;
		}
		else
			return false;
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		List<Book> bookList = daoImpl.findAll();
		return bookList;
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		Book book = daoImpl.findById(id).get();
		//returns book if found else null
		
		return book;
	}

	@Override
	public boolean updateBook(Book book) {
		// TODO Auto-generated method stub
		//Find if the book exists
//		Book b = daoImpl.findById(book.getBid()).get();
//		
//		if (b!= null) {
//			//book found
//			//update the book
//			saveBook (book);
//			return true;
//		}
//		else //book not found
//			return false;
		
		return saveBook(book);
	}

	@Override
	public boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		
		Book book_to_dlt = daoImpl.findById(id).get();
		
		if (book_to_dlt != null) {
			//book found now dlt it
			daoImpl.deleteById(id);	
			return true;
		}
		else //book not found
			return false;

	}

}
