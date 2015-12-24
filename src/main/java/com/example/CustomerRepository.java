package com.example;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface CustomerRepository extends MongoRepository<Customer, String> , QueryDslPredicateExecutor<Customer>{

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByAccountsTotal(int total);

}