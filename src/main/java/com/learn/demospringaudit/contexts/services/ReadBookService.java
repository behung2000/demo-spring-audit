package com.learn.demospringaudit.contexts.services;

import com.learn.demospringaudit.contexts.repositories.ReadBookRepository;
import com.learn.demospringaudit.contexts.responses.BookResponse;
import com.learn.demospringaudit.contexts.responses.BooksResponse;
import org.springframework.data.domain.PageRequest;

public class ReadBookService {

    private ReadBookRepository read;

    public ReadBookService(final ReadBookRepository read) {
        this.read = read;
    }

    public BooksResponse getAllBooks(Integer pageNo, Integer pageSize) {
        return read.findAll(PageRequest.of(pageNo, pageSize));
    }

    public BookResponse getBookById(Integer id) {
        return read.findById(id);
    }
}
