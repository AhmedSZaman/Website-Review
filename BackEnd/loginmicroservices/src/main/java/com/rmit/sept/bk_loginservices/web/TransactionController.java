package com.rmit.sept.bk_loginservices.web;

import com.rmit.sept.bk_loginservices.model.Transaction;
import com.rmit.sept.bk_loginservices.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/addTransaction")
    public ResponseEntity<Transaction> createNewTransaction(@RequestBody Transaction transaction) {
        Transaction transaction1 = transactionService.saveOrUpdateTransaction(transaction);
        return new ResponseEntity<Transaction>(transaction, HttpStatus.CREATED);
    }

    @RequestMapping ("/getTransaction/{Id}")
    public ResponseEntity<Transaction> getTransaction(@PathVariable("Id") Long Id) {

        Transaction transaction = transactionService.getTransaction(Id);
        return new ResponseEntity<Transaction>(transaction, HttpStatus.FOUND);
    }

    @RequestMapping ("/getTransactions")
    public ResponseEntity<List<Transaction>> getTransactions() {


        List<Long> result = new ArrayList<Long>();

        Iterable<Long> iter = (Iterable<Long>) result.listIterator();

        Iterable<Transaction> tmp = transactionService.getTransactions(iter);

        List<Transaction> transactions = new ArrayList<Transaction>();

        tmp.forEach(transaction -> {
            transactions.add(transaction);
        });

        System.out.println(transactions);

        return new ResponseEntity<List<Transaction>>(transactions, HttpStatus.FOUND);
    }
}
