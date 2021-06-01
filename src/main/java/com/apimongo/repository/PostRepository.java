package com.apimongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apimongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
