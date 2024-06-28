package com.example.demo.service;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;

import java.util.List;


public interface AuthorService {
    Author save (Author author);
    void delete (Long id);
    void update (Author author);
    List<Author> getAuthors ();
}
