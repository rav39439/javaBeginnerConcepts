package com.springweb.web.dao;


import org.springframework.data.repository.CrudRepository;

import com.springweb.web.entities.Book;


public interface Bookrepository extends CrudRepository<Book, Integer> {

}
