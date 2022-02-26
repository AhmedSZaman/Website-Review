package com.rmit.sept.bk_loginservices.Repositories;

import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.BookReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookReviewRepository extends CrudRepository<BookReview, Long> {

    Iterable<BookReview> findAllById(Iterable<Long> iterable);
    BookReview getById(Long Id);
}
