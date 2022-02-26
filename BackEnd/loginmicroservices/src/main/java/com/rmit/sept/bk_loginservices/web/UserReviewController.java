package com.rmit.sept.bk_loginservices.web;

import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.UserReview;
import com.rmit.sept.bk_loginservices.services.BookService;
import com.rmit.sept.bk_loginservices.services.UserReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/userReview")
public class UserReviewController {

    @Autowired
    private UserReviewService userReviewService;

    @PostMapping("/addUserReview")
    public ResponseEntity<UserReview> createNewUserReview(@RequestBody UserReview userReview) {
        UserReview userReview1 = userReviewService.saveOrUpdateUserReview(userReview);
        return new ResponseEntity<UserReview>(userReview, HttpStatus.CREATED);
    }

    @RequestMapping ("/getUserReview/{Id}")
    public ResponseEntity<UserReview> getUserReview(@PathVariable("Id") Long Id) {

        UserReview userReview = userReviewService.getUserReview(Id);
        return new ResponseEntity<UserReview>(userReview, HttpStatus.FOUND);
    }
}
