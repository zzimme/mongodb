package com.example.relatedocument;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface CommentRepository extends MongoRepository<Comment, ObjectId>, QueryDslPredicateExecutor<Comment>{

}
