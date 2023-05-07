package com.book.author.repository;

import com.book.author.entity.Author;
import com.book.author.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
    Author findByName(String name);
   // List<Book> findByName(String name);
}
