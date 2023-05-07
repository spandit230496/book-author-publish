package com.book.author.service;

import com.book.author.entity.Author;
import com.book.author.entity.Book;
import com.book.author.entity.Publish;
import com.book.author.repository.AuthorRepository;
import com.book.author.repository.PublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    PublishRepository publishRepository;
    public void addAuthor(Author author){

        authorRepository.save(author);

    }





}
