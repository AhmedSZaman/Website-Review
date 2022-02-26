package com.rmit.sept.bk_loginservices.Repositories;

import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Iterable<Book> findAllById(Iterable<Long> iterable);
    Book getById(Long Id);
}
