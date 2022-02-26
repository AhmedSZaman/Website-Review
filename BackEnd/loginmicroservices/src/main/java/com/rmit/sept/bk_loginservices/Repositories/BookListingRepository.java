package com.rmit.sept.bk_loginservices.Repositories;

import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.BookListing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookListingRepository extends CrudRepository<BookListing, Long> {

    Iterable<BookListing> findAllById(Iterable<Long> iterable);
    BookListing getById(Long Id);
}
