package com.apimongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apimongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
