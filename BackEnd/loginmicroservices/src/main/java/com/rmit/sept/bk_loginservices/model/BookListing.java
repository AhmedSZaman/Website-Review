package com.rmit.sept.bk_loginservices.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class BookListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(targetEntity = Book.class, fetch= FetchType.LAZY)
    @NotNull(message = "Listing must have a book")
    private Book book;
    @NotNull(message = "Listing must have a price")
    private double price;
    @NotNull(message = "Listing must have a seller")
    private User seller;


    @NotNull(message = "Listing must have quantity")
    private int quantity;
    @NotNull(message = "Book my have condition")
    private boolean newCondition;



    public BookListing() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isNewCondition() {
        return newCondition;
    }

    public void setNewCondition(boolean newCondition) {
        this.newCondition = newCondition;
    }
}
