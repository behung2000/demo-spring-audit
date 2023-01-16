package com.learn.demospringaudit.contexts.repositories;

import com.learn.demospringaudit.contexts.responses.BookResponse;
import com.learn.demospringaudit.contexts.responses.BooksResponse;
import org.springframework.data.domain.PageRequest;

public interface ReadBookRepository {
    BooksResponse findAll(final PageRequest page);

    BookResponse findById(Integer id);
}
