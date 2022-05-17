package com.example.mongodbembedded.repository;

import com.example.mongodbembedded.entity.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>   {
    
}
