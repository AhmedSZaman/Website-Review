package com.rmit.sept.bk_loginservices.Repositories;

import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    Iterable<Transaction> findAllById(Iterable<Long> iterable);
    Transaction getById(Long Id);
}
