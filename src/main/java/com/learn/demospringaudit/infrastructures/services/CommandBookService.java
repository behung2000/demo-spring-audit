package com.learn.demospringaudit.infrastructures.services;

import com.learn.demospringaudit.contexts.models.BookInfo;
import com.learn.demospringaudit.contexts.repositories.WriteBookRepository;
import com.learn.demospringaudit.contexts.responses.BookResponse;
import com.learn.demospringaudit.infrastructures.models.Book;
import com.learn.demospringaudit.infrastructures.repositories.CommandBookRepository;
import org.springframework.beans.BeanUtils;

public class CommandBookService implements WriteBookRepository {
    private CommandBookRepository repository;

    public CommandBookService(CommandBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public BookResponse save(BookInfo bookInfo) {
        Book book = Book.builder().build();
        BeanUtils.copyProperties(bookInfo, book);
        book.setActive(true);
        return saveBookToDB(book);
    }

    @Override
    public BookResponse update(BookInfo bookInfo) {
        Book book = repository.findById(bookInfo.getId()).orElseThrow(
            () -> new RuntimeException("Not Found")
        );
        BeanUtils.copyProperties(bookInfo, book);
        return saveBookToDB(book);
    }

    @Override
    public BookResponse delete(Integer id) {
        Book book = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        book.setActive(false);
        return saveBookToDB(book);
    }

    private BookResponse saveBookToDB(Book book) {
        BookInfo bookInfo = BookInfo.builder().build();
        Book saved = repository.saveAndFlush(book);
        BeanUtils.copyProperties(saved, bookInfo);
        return BookResponse.builder().status(0).messenger(null).bookInfo(bookInfo).build();
    }
}
