package com.rmit.sept.bk_loginservices.web;

import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.Category;
import com.rmit.sept.bk_loginservices.services.BookService;
import com.rmit.sept.bk_loginservices.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/addCategory")
    public ResponseEntity<Category> createNewCategory(@RequestBody Category category) {
        Category category1 = categoryService.saveOrUpdateCategory(category);
        return new ResponseEntity<Category>(category, HttpStatus.CREATED);
    }

    @RequestMapping ("/getCategory/{Id}")
    public ResponseEntity<Category> getCategory(@PathVariable("Id") Long Id) {

        Category category = categoryService.getCategory(Id);
        return new ResponseEntity<Category>(category, HttpStatus.FOUND);
    }
}
