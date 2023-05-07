package com.book.author.service;

import com.book.author.entity.Author;
import com.book.author.entity.Book;
import com.book.author.entity.Publish;
import com.book.author.repository.AuthorRepository;
import com.book.author.repository.BookRepository;
import com.book.author.repository.PublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublishService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    PublishRepository publishRepository;

    public void addPublish(Publish publish){
        Author author= authorRepository.findByName(publish.getAuthor());
        Book book = bookRepository.findByName(publish.getBook());

        if(author==null||book==null){
            throw new RuntimeException("Author or Book not found");
        }
        else
            publishRepository.save(publish);
    }
    public int getBook(String name , int Year){
        List<Publish> book = publishRepository.findAll();
        List<Publish>totalbook=new ArrayList<>();


        for( Publish x: book){
            if(x.getAuthor().equals(name) && x.getYear()==Year)
                totalbook.add(x);

        }
        return totalbook.size();
    }
}
