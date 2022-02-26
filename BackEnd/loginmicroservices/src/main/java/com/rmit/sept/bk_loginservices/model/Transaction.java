package com.rmit.sept.bk_loginservices.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "review must have a buying users")
    private User buyingUser;

    @NotNull(message = "review must have a selling users")
    private User sellingUser;

    @OneToOne(targetEntity = BookListing.class, fetch= FetchType.LAZY)
    @NotNull(message = "Transaction must have a corresponding listing")
    private BookListing bookListing;

    public Transaction() {
    }

    public Long getTransactionID() {
        return id;
    }

    public User getBuyingUser() {
        return buyingUser;
    }

    public void setBuyingUser(User buyingUser) {
        this.buyingUser = buyingUser;
    }

    public User getSellingUser() {
        return sellingUser;
    }

    public void setSellingUser(User sellingUser) {
        this.sellingUser = sellingUser;
    }

    public BookListing getBookListing() {
        return bookListing;
    }

    public void setBookListing(BookListing bookListing) {
        this.bookListing = bookListing;
    }
}
