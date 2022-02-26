package com.rmit.sept.bk_loginservices.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class BookReview  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Review must have a reviewing user")
    private User reviewer;

    @NotNull(message = "Review must have a rating")
    private double rating;

    private String reviewString;

    @ManyToOne(targetEntity = Book.class, fetch= FetchType.LAZY)
    @NotNull(message = "Review must have a target book")
    private Book book;

    public BookReview() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Long getReviewID() {
        return id;
    }

    public User getReviewer() {
        return reviewer;
    }

    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReviewString() {
        return reviewString;
    }

    public void setReviewString(String reviewString) {
        this.reviewString = reviewString;
    }
}
