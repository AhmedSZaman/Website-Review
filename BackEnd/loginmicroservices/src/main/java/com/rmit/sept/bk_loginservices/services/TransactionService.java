package com.rmit.sept.bk_loginservices.services;

import com.rmit.sept.bk_loginservices.Repositories.BookRepository;
import com.rmit.sept.bk_loginservices.Repositories.TransactionRepository;
import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction saveOrUpdateTransaction(Transaction transaction) {
        //business logic

        return transactionRepository.save(transaction);
    }

    public Transaction getTransaction(Long Id) {
        return transactionRepository.getById(Id);
    }

    public Iterable<Transaction> getTransactions(Iterable<Long> iterable) { return transactionRepository.findAllById(iterable);}
}
