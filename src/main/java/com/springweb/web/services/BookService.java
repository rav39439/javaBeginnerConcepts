package com.springweb.web.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springweb.web.dao.Bookrepository;
import com.springweb.web.entities.Book;

@Component

public class BookService {
	
	@Autowired
	private Bookrepository bookrepository;
	
	public List<Book> getallbook(){
		
		
		List<Book> list=(List<Book>) this.bookrepository.findAll();
		return list;
		
	}

	
	public Optional<Book> getbookbyid(int id) {
		Optional<Book> book=null;
		try {
			book=this.bookrepository.findById(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	public Book addbook(Book b) {
		Book result=this.bookrepository.save(b);
		return result;
	}
	
	public void deletebook(int bid) {
		bookrepository.deleteById(bid);
	}
	
	public Book updatebook(Book book ,int bookid) {
		book.setId(bookid);
		return this.bookrepository.save(book);
	}
	
}
