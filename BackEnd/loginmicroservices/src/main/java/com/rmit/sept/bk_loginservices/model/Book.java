package com.rmit.sept.bk_loginservices.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Book {

    /*
    NOTE
    -----
    Book should be using ISBN as the ID, per assigment spec.
    However, we had error with setting ID manually.
    As this was a blocker, removing for now and using auto generated ID
     */


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


//    @Id
//    //@Size(min = 13, max = 13, message = "Please enter 13 digit ISBN-13 number")
//    @NotNull(message = "ISBN is required")
//    private Long ISBN;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Author is required")
    private String author;
    @NotNull(message = "Author is required")
    private LocalDate datePublished;
    @NotBlank(message = "Publisher is required")
    private String publisher;
    @ManyToMany(targetEntity = Category.class, fetch= FetchType.LAZY)
    //@NotNull(message = "Book must have at least one category")
    private List<Category> categories;



    // constructor
    public Book(String name, String author, LocalDate datePublished, String publisher, List<Category> categories) {
        this.name = name;
        this.author = author;
        this.datePublished = datePublished;
        this.publisher = publisher;
        this.categories = categories;
    }

    public Long getId() { return id; }

    public void setId(Long Id) { this.id = id; }

//    public Long getISBN() {
//        return ISBN;
//    }
//
//    public void setISBN(Long ISBN) {
//        this.ISBN = ISBN;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
