package com.springweb.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book 
{
	
	@Id
private int id;

private String title;
private String Author;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", Author=" + Author + "]";
}

}
