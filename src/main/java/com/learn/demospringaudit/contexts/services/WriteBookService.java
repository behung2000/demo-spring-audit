package com.learn.demospringaudit.contexts.services;

import com.learn.demospringaudit.contexts.models.BookInfo;
import com.learn.demospringaudit.contexts.repositories.WriteBookRepository;
import com.learn.demospringaudit.contexts.responses.BookResponse;

public class WriteBookService {
    private WriteBookRepository write;

    public WriteBookService(final WriteBookRepository write) {
        this.write = write;
    }

    public BookResponse create(BookInfo bookInfo) {
        bookInfo.validate();
        return write.save(bookInfo);
    }

    public BookResponse update(BookInfo bookInfo) {
        bookInfo.validate();
        return write.update(bookInfo);
    }

    public BookResponse delete(Integer id) {
        return write.delete(id);
    }
}
