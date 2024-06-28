package com.example.demo.service;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface BookService {

    Optional<Book> findById (Long id);
    Book save (Book book) ;
    void delete (Long id) ;
    void update (Book book) ;
    List<Book> getBooksOrderByName () ;
    List<Book> getBooksOrderByIsbn () ;

}
