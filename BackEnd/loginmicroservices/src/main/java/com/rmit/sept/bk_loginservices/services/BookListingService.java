package com.rmit.sept.bk_loginservices.services;

import com.rmit.sept.bk_loginservices.Repositories.BookListingRepository;
import com.rmit.sept.bk_loginservices.Repositories.BookRepository;
import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.BookListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookListingService {
    @Autowired
    private BookListingRepository bookListingRepository;

    public BookListing saveOrUpdateBookListing(BookListing bookListing) {
        //business logic

        return bookListingRepository.save(bookListing);
    }

    public BookListing getBookListing(Long Id) {
        return bookListingRepository.getById(Id);
    }
}
