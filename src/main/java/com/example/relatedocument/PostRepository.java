package com.example.relatedocument;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;


public interface PostRepository extends MongoRepository<Post, ObjectId>, QueryDslPredicateExecutor<Post>{

}
