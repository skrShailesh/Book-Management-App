package com.bookstore.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;
import com.bookstore.entity.Book;
import com.bookstore.service.BookService;



@Controller
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping("/")
	public String home() {
		return  "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@GetMapping("/available_books")
//	public String getAllBook() {
//		return  "bookList";}
	public ModelAndView getAllBook() {
		List<Book>list=service.getAllBook();
		return new ModelAndView("bookList","book",list);
	}
	
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		service.save(b);  //this save(b) is called from class BookService
		return "redirect:/available_books";
	}
	
	@GetMapping("/my_books")
	public String getMyBooks() {
		return "myBooks";
	}
	
	
}
