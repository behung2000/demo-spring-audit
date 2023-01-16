package com.learn.demospringaudit.infrastructures.services;

import com.learn.demospringaudit.contexts.repositories.ReadBookRepository;
import com.learn.demospringaudit.contexts.responses.BookResponse;
import com.learn.demospringaudit.contexts.responses.BooksResponse;
import com.learn.demospringaudit.infrastructures.models.Book;
import com.learn.demospringaudit.infrastructures.repositories.QueryBookRepository;
import com.learn.demospringaudit.infrastructures.utils.EntityMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class QueryBookService implements ReadBookRepository {
    private QueryBookRepository repository;

    public QueryBookService(QueryBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public BooksResponse findAll(PageRequest page) {
        EntityMapper mapper = new EntityMapper();
        Page<Book> bookPage = repository.findAll(page);
        return mapper.toBooksResponse(bookPage);
    }

    @Override
    public BookResponse findById(Integer id) {
        return null;
    }
}
