package com.example.demo.controller;

import com.example.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping
    public String listar(Model model){
        model.addAttribute("posts",postService.listar());
        return "posts";
    }
}
