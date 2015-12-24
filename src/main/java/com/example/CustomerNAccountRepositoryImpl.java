package com.example;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.mysema.query.alias.Alias;
import com.mysema.query.types.expr.BooleanExpression;


public class CustomerNAccountRepositoryImpl {

	/*
	public CustomerNAccountRepositoryImpl(MongoOperations operations) {
		super(operations);
		// TODO Auto-generated constructor stub
	}

	
	
	public List<Customer> findByCustomerFirstName(String name){
		Customer cna = Alias.alias(Customer.class);
		BooleanExpression predicate = Alias.$(cna.getFirstName())
				.eq(name);
		
		return this.from(Alias.$(cna)).where(predicate).list(Alias.$(cna));
		
		Query query4 = new Query();
		query4.addCriteria(
			Criteria.where("customerNAccount").exists(true)
			.andOperator(
				Criteria.where("age").gt(10),
		                Criteria.where("age").lt(40)
			)
		);
return null;
		List<User> userTest4 = mongoOperation.find(query4, User.class);
		System.out.println("query4 - " + query4.toString());

	}
	
*/
}
