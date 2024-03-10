package com.example.FullStackSpringBootMongoDB4.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FullStackSpringBootMongoDB4.model.Post;
import com.example.FullStackSpringBootMongoDB4.repository.PostRepository;
import com.example.FullStackSpringBootMongoDB4.repository.SearchRepository;

import jakarta.servlet.http.HttpServletResponse;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
	
	@Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;
    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }
    // posts/java
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }
}
