package com.rmit.sept.bk_loginservices.web;

import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.User;
import com.rmit.sept.bk_loginservices.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public ResponseEntity<Book> createNewBook(@RequestBody Book book) {
        Book book1 = bookService.saveOrUpdateBook(book);
        return new ResponseEntity<Book>(book, HttpStatus.CREATED);
    }

    @RequestMapping ("/getBook/{Id}")
    public ResponseEntity<Book> getBook(@PathVariable("Id") Long Id) {

        Book book = bookService.getBook(Id);
        return new ResponseEntity<Book>(book, HttpStatus.FOUND);
    }
}
