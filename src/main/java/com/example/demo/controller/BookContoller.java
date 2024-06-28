package com.example.demo.controller;


import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.service.AuthorService;
import com.example.demo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookContoller {

    private final BookService bookService;

    @PostMapping
    public void save (@RequestBody Book book) {
        bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook (@PathVariable String id) {
        bookService.delete(Long.parseLong(id));
    }

    @PutMapping
    public void updateBook (@RequestBody Book book) {
       bookService.update(book);
    }

    @GetMapping("/orderByName")
    public List<Book> getBooksOrderByName () {
        return  bookService.getBooksOrderByName();
    }

    @GetMapping("/orderByIsbn")
    public List<Book> getBooksOrderByIsbn () {
       return bookService.getBooksOrderByIsbn();
    }

}
