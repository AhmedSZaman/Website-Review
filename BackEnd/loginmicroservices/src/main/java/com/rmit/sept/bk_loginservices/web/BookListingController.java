package com.rmit.sept.bk_loginservices.web;

import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.BookListing;
import com.rmit.sept.bk_loginservices.services.BookListingService;
import com.rmit.sept.bk_loginservices.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookListing")
public class BookListingController {

    @Autowired
    private BookListingService bookListingService;

    @PostMapping("/addBook")
    public ResponseEntity<BookListing> createNewBook(@RequestBody BookListing bookListing) {
        BookListing bookListing1 = bookListingService.saveOrUpdateBookListing(bookListing);
        return new ResponseEntity<BookListing>(bookListing, HttpStatus.CREATED);
    }

    @RequestMapping ("/getBookListing/{Id}")
    public ResponseEntity<BookListing> getBookListing(@PathVariable("Id") Long Id) {

        BookListing bookListing = bookListingService.getBookListing(Id);
        return new ResponseEntity<BookListing>(bookListing, HttpStatus.FOUND);
    }
}
