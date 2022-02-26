package com.rmit.sept.bk_loginservices.services;

import com.rmit.sept.bk_loginservices.Repositories.BookRepository;
import com.rmit.sept.bk_loginservices.Repositories.UserReviewRepository;
import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.UserReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserReviewService {
    @Autowired
    private UserReviewRepository userReviewRepository;

    public UserReview saveOrUpdateUserReview(UserReview userReview) {
        //business logic

        return userReviewRepository.save(userReview);
    }

    public UserReview getUserReview(Long id) {
        return userReviewRepository.getById(id);
    }
}