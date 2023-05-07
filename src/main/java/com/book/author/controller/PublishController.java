package com.book.author.controller;

import com.book.author.entity.Book;
import com.book.author.entity.Publish;
import com.book.author.service.BookService;
import com.book.author.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublishController {

    @Autowired
    PublishService publishService;

    @PostMapping("/save_publish")
    public String addPublish(@RequestBody Publish publish) {
        publishService.addPublish(publish);

        return "publish Added Successfully";


    }

    @GetMapping("/get_book")
    public int getBook(@RequestParam("name") String name, @RequestParam("year") int year) {
        return publishService.getBook(name, year);
    }
}