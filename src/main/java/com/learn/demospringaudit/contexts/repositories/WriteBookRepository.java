package com.learn.demospringaudit.contexts.repositories;

import com.learn.demospringaudit.contexts.models.BookInfo;
import com.learn.demospringaudit.contexts.responses.BookResponse;

public interface WriteBookRepository {
    BookResponse save(BookInfo bookInfo);
    BookResponse update(BookInfo bookInfo);
    BookResponse delete(Integer id);
}
