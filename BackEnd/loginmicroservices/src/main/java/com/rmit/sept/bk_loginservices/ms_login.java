package com.rmit.sept.bk_loginservices;

import com.rmit.sept.bk_loginservices.Repositories.UserRepository;
import com.rmit.sept.bk_loginservices.model.*;
import com.rmit.sept.bk_loginservices.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ms_login {

    public static void main(String[] args) {
        //SpringApplication.run(ms_login.class, args);
        ConfigurableApplicationContext app=SpringApplication.run(ms_login.class, args);


        // SEED DATA services
        UserService userService = app.getBean(UserService.class);
        CategoryService categoryService = app.getBean(CategoryService.class);
        BookService bookService = app.getBean(BookService.class);
        BookListingService bookListingService = app.getBean(BookListingService.class);
        TransactionService transactionService = app.getBean(TransactionService.class);


        //User seed data
        User testUser = new User();
        testUser.setUsername("test@test.com");
        testUser.setFullName("Test Test");
        testUser.setPassword("qwerty1234");
        testUser.setConfirmPassword("qwerty1234");

        userService.saveUser(testUser);

        // test admin user
        User testAdmin = new User();
        testAdmin.setUsername("admin@admin.com");
        testAdmin.setFullName("Admin Test");
        testAdmin.setPassword("123456");
        testAdmin.setConfirmPassword("123456");
        testAdmin.setAdmin(true);

        userService.saveUser(testAdmin);

        //test category

        Category testCategory = new Category();
        testCategory.setCategory("Fantasy");

        categoryService.saveOrUpdateCategory(testCategory);

        // Categories stored as a list in book objects, creating list for testBook
        List<Category> categoriesList = new ArrayList<Category>();
        categoriesList.add(testCategory);

        // date object for book release
        LocalDate date = LocalDate.of(1997,06,26);

        // testBook
        Book testBook = new Book("Harry Potter and the Philosopher's Stone", "Rowling, J. K.", date, "Bloomsbury Pub Ltd", categoriesList);

        // this is the correct ISBN (as long) for book
        //testBook.setId(9780747532743l);


        bookService.saveOrUpdateBook(testBook);

        // test bookListing
        BookListing testBookListing = new BookListing();
        testBookListing.setBook(testBook);
        testBookListing.setNewCondition(true);
        testBookListing.setPrice(29.99);
        testBookListing.setQuantity(5);


        // test transaction
        Transaction testTransaction = new Transaction();
        testTransaction.setBookListing(testBookListing);


    }
    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
