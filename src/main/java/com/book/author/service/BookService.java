package com.book.author.service;

import com.book.author.entity.Author;
import com.book.author.entity.Book;
import com.book.author.repository.AuthorRepository;
import com.book.author.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;
    public void addBook(Book book){
        Author author =authorRepository.findByName(book.getAuthorName());

        if(author==null){
            throw new RuntimeException("Author not Found");
        }
        bookRepository.save(book);
    }
}
