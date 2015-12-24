package com.example.relatedocument;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface EmoticonRepository extends MongoRepository<Emoticon, ObjectId>, QueryDslPredicateExecutor<Emoticon>{

}
