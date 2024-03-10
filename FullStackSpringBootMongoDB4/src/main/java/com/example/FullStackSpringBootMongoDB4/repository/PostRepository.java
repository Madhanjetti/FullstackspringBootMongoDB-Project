package com.example.FullStackSpringBootMongoDB4.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.FullStackSpringBootMongoDB4.model.Post;

public interface PostRepository extends MongoRepository<Post,String>
{

}
