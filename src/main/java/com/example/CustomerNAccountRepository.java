package com.example;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

@SuppressWarnings("rawtypes")
public interface CustomerNAccountRepository extends MongoRepository<CustomerNAccount, ObjectId>, QueryDslPredicateExecutor<CustomerNAccount>{

	//public List<CustomerNAccount> findByCustomerIdAndAccountId(String customerId, ObjectId accountId);
	//public List<CustomerNAccount> findByCustomerId(String customerId);
	//public List<CustomerNAccount> findByAccountIdNotIn(List<ObjectId> args);
	//public List<CustomerNAccount> findByCustomerIdAndCustomerFirstName(String customerId, String name);
	//public List<CustomerNAccount> findByCustomerFirstName(String name);
	
	public List<CustomerNAccount> findByCustomerIn(List<Customer> arg);
	//@Query(fields="{ 'account' : 1}")
	public List<CustomerNAccount> findDistinctAccountByCustomer(Customer arg);
	
}
