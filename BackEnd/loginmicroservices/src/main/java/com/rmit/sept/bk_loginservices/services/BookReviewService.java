package com.rmit.sept.bk_loginservices.services;

import com.rmit.sept.bk_loginservices.Repositories.BookRepository;
import com.rmit.sept.bk_loginservices.Repositories.BookReviewRepository;
import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.BookReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookReviewService {
    @Autowired
    private BookReviewRepository bookReviewRepository;

    public BookReview saveOrUpdateBookReview(BookReview bookReview) {
        //business logic

        return bookReviewRepository.save(bookReview);
    }

    public BookReview getBookReview(Long Id) {
        return bookReviewRepository.getById(Id);
    }
}
