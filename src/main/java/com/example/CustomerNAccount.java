package com.example;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mysema.query.annotations.QueryEntity;

@QueryEntity
@Document
@CompoundIndexes({
	@CompoundIndex(name = "customer_account", def = "{'customer': 1, 'account': 1}",unique=true)
})
public class CustomerNAccount extends BaseModel{

	/*@Id
	private ObjectId id;
	*/
	@DBRef
	private Customer customer;
	
	@DBRef
	private Account account;

/*	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}*/

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
