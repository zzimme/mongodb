package com.example;

import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import com.mongodb.DBObject;

@ReadingConverter
public class CustomerNAccountReadConverter implements Converter<DBObject, CustomerNAccount> {

 public CustomerNAccount convert(DBObject source) {

	 CustomerNAccount cna = new CustomerNAccount();
	 cna.setAccount((Account) source.get("account"));
	 return cna;
 }
}