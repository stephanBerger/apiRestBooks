package fr.wcs.apirestbook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String title;
	private String author;
	private String description;

	public Book() {
	}
	
	
	public Book(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}
	

	public Book(Integer id, String title, String author, String description) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				", decription='" + description + '\'' +
				'}';
	}
}