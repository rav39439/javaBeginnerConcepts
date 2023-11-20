package com.springweb.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.web.entities.Book;
import com.springweb.web.services.BookService;

@RestController

public class Bookcontroller {

	@Autowired
	
	private BookService bookservice;
	
	
	@GetMapping("/books")
	public ResponseEntity <List <Book>> getbook(){
		List<Book> list=this.bookservice.getallbook();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Optional<Book>> getbook(@PathVariable ("id") int id){
		
		
		Optional<Book> book=this.bookservice.getbookbyid(id);
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
		
	}
	
	@PostMapping("/book")
	public ResponseEntity <Book> addbook(@RequestBody Book book){
		Book b=null;
				try {
					b=this.bookservice.addbook(book);
					return ResponseEntity.of(Optional.of(b));
				}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
	}
				
	@DeleteMapping("/book/{bookid}")
	public ResponseEntity <?> deletebook(@PathVariable ("bookid") int bookid){
		try {
			this.bookservice.deletebook(bookid);
			return ResponseEntity.ok().build();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@PutMapping("/book/{bookid}")
	public ResponseEntity <Book> updatebook(@RequestBody Book book,@PathVariable ("bookid") int id){
		
		Book b=null;
		b=this.bookservice.updatebook(book, id);
		if(b==null) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(b));
				
	}
	
	
}
