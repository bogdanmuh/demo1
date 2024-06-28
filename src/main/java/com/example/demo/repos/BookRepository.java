package com.example.demo.repos;

import com.example.demo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByOrderByNameAsc();

    List<Book> findAllByOrderByIsbnAsc();
}

