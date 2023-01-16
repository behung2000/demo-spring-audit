package com.learn.demospringaudit.distributed.controllers;

import com.learn.demospringaudit.contexts.models.BookInfo;
import com.learn.demospringaudit.contexts.responses.BookResponse;
import com.learn.demospringaudit.contexts.responses.BooksResponse;
import com.learn.demospringaudit.contexts.services.ReadBookService;
import com.learn.demospringaudit.contexts.services.WriteBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/spring/book")
public class BookController {
    private ReadBookService readBookService;
    private WriteBookService writeBookService;

    public BookController(ReadBookService readBookService, WriteBookService writeBookService) {
        this.readBookService = readBookService;
        this.writeBookService = writeBookService;
    }

    @GetMapping("")
    public BooksResponse getAllBooks(
            @RequestParam(required = false) Integer pageNo,
            @RequestParam(required = false) Integer pageSize) {
        pageNo = (pageNo == null || pageNo < 0) ? 0 : pageNo;
        pageSize = (pageSize == null || pageSize <= 0) ? 10 : pageSize;
        return readBookService.getAllBooks(pageNo, pageSize);
    }

    @PostMapping("")
    public BookResponse postBook(@RequestBody BookInfo bookInfo) {
        return writeBookService.create(bookInfo);
    }

    @PutMapping("")
    public BookResponse putBook(@RequestBody BookInfo bookInfo) {
        return writeBookService.update(bookInfo);
    }
}
