package com.book.author.controller;

import com.book.author.entity.Book;
import com.book.author.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/save_book")
    public String addBook( @RequestBody  Book book){
        bookService.addBook(book);

        return "Book Added Successfully";
    }
}
