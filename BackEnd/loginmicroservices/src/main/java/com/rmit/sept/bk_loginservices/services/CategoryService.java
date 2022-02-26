package com.rmit.sept.bk_loginservices.services;

import com.rmit.sept.bk_loginservices.Repositories.BookRepository;
import com.rmit.sept.bk_loginservices.Repositories.CategoryRepository;
import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveOrUpdateCategory(Category category) {
        //business logic

        return categoryRepository.save(category);
    }

    public Category getCategory(Long Id) {
        return categoryRepository.getById(Id);
    }
}
