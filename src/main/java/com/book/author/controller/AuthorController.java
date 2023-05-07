package com.book.author.controller;

import com.book.author.entity.Author;
import com.book.author.entity.Book;
import com.book.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("/add_author")
    public String addAuthor(@RequestBody  Author author){
        authorService.addAuthor(author);


        return "Added Successfully";
    }





}
