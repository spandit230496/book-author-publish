package com.book.author.repository;

import com.book.author.entity.Publish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishRepository extends JpaRepository<Publish,Integer> {
}
