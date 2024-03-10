package com.example.FullStackSpringBootMongoDB4.repository;


import java.util.List;

import com.example.FullStackSpringBootMongoDB4.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}