package com.learn.demospringaudit.infrastructures.repositories;

import com.learn.demospringaudit.infrastructures.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandBookRepository extends JpaRepository<Book, Integer> {
}
