package com.rmit.sept.bk_loginservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class UserReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Review must have a reviewing user")
    private User reviewer;

    @NotNull(message = "Review must have a rating")
    private double rating;

    private String reviewString;


    @NotNull(message = "review must have a target users")
    private User reviewedUser;

    public UserReview() {
    }

    public User getReviewedUser() {
        return reviewedUser;
    }

    public void setReviewedUser(User reviewedUser) {
        this.reviewedUser = reviewedUser;
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
