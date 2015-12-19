package com.example;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerNAccountRepository extends MongoRepository<CustomerNAccount, ObjectId> {

}
