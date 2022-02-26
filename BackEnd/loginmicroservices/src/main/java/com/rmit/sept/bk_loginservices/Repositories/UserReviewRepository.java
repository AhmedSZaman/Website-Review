package com.rmit.sept.bk_loginservices.Repositories;

import com.rmit.sept.bk_loginservices.model.Book;
import com.rmit.sept.bk_loginservices.model.UserReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReviewRepository extends CrudRepository<UserReview, Long> {

    Iterable<UserReview> findAllById(Iterable<Long> iterable);
    UserReview getById(Long Id);
}
