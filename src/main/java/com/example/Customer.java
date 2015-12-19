package com.example;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;


public class Customer  {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    /*@DBRef
    private Account account;*/
    
    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

/*	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}*/

	@Override
	public String toString() {

		return ToStringBuilder.reflectionToString( this, ToStringStyle.MULTI_LINE_STYLE );
	}
	
   
}