package com.rmit.sept.bk_loginservices.web;

import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.BookReview;
import com.rmit.sept.bk_loginservices.services.BookReviewService;
import com.rmit.sept.bk_loginservices.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookReview")
public class BookReviewController {

    @Autowired
    private BookReviewService bookReviewService;

    @PostMapping("/addBookReview")
    public ResponseEntity<BookReview> createNewBook(@RequestBody BookReview bookReview) {
        BookReview bookReview1 = bookReviewService.saveOrUpdateBookReview(bookReview);
        return new ResponseEntity<BookReview>(bookReview, HttpStatus.CREATED);
    }

    @RequestMapping ("/getBookReview/{Id}")
    public ResponseEntity<BookReview> getBookReview(@PathVariable("Id") Long Id) {

        BookReview bookReview = bookReviewService.getBookReview(Id);
        return new ResponseEntity<BookReview>(bookReview, HttpStatus.FOUND);
    }
}
