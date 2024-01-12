package com.ruchi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ruchi.entity.Book;
import com.ruchi.service.impl.BookServiceImpl;

@Controller
public class BookController {
	
	@Autowired
	private BookServiceImpl daoService;
	
	@RequestMapping ("/")
	public String loadForm(Model model) {
		Book book = new Book();
		
		//model interface carry the data to view component
		model.addAttribute(book);
		
		return "addnewbookform";
	}
	
	@RequestMapping (value = "/save")
	public String handleBookForm(@ModelAttribute("book") Book book, Model model) {
		
		//@modelAtt annotation can hold the data and carry the data to view component
		boolean saveBook = daoService.saveBook(book);
		
		String msg ="";
		
		if (saveBook) {
			msg ="Book was successfully saved";
		}
		else
			msg= "Error! Book couldn't be saved";
		
		model.addAttribute ("msg", msg);
		
		return "redirect:viewAll";
	}
	
	@RequestMapping("/viewAll")
	public String viewAllBooks (Model model, @ModelAttribute("msg") String msg) {
		
		List<Book> bookList = daoService.getAllBook();
//		String msg ="yes hello";
		model.addAttribute("msg", msg);
		model.addAttribute(bookList);

		return "displayBookList";
	}
	
	@RequestMapping ("/edit")
	public String editBook(@RequestParam("id") int id, Model model) {
		//query parameters with ?  request param
//		http://localhost:8081/edit?id=1
		
		//get book info by id
		Book book_to_edit =daoService.getBookById(id);
		model.addAttribute(book_to_edit);
		
		return "editbook";
		
	}
	@RequestMapping ("/update")
	public String handleEdit(@ModelAttribute("book") Book book, Model model) {
		//query parameters with ?  request param
//		http://localhost:8081/edit?id=1
		
		//get book info by id
		boolean updateBook = daoService.updateBook(book);
		
		String msg ="";
		
		if (updateBook) {
			msg ="Book was successfully Updated";
		}
		else
			msg= "Error! Book couldn't be Updated";
		
		model.addAttribute ("msg", msg);
		
		return "redirect:/viewAll";		
				
	}
	

	@RequestMapping ("/delete/{id}")
	public String deleteBook(@PathVariable("id") int id, Model model) {
		//path Variable with ?  request param
//		http://localhost:8081/delete/1		
//		get book info by id
		
		boolean deleteReq =daoService.deleteBook(id);
		
		String msg ="";
		
		if (deleteReq) {
			msg ="Book was successfully Deleted";
		}
		else
			msg= "Error! Book couldn't be Deleted";
		
		model.addAttribute ("msg", msg);
		
		
		return "redirect:/viewAll";
		
	}


}
