package com.learn.demospringaudit.infrastructures.repositories;

import com.learn.demospringaudit.infrastructures.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryBookRepository extends JpaRepository<Book, Integer> {
}
