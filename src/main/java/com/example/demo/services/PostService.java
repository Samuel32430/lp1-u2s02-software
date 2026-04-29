package com.example.demo.services;
import com.example.demo.modelo.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService {
    @Autowired
    private PostRepository repository;
    public  List<Post> listar(){
        return repository.findAll();
    }
}
