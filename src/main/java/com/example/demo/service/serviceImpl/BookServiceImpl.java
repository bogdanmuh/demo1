package com.example.demo.service.serviceImpl;

import com.example.demo.domain.Book;
import com.example.demo.repos.BookRepository;
import com.example.demo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;


    public Optional<Book> findById (Long id) {
        return bookRepository.findById(id);
    }

    public Book save (Book book) {
        return bookRepository.save(book);
    }

    public void delete (Long id) {
        bookRepository.deleteById(id);
    }

    public void update (Book book) {
        bookRepository
                .findById(book.getId())
                .ifPresent(book1 -> {
                    book1.setAuthors(book.getAuthors());
                    book1.setName(book.getName());
                    book1.setDescription(book.getDescription());
                    book1.setCreateDate(book.getCreateDate());
                    bookRepository.save(book1);
                });
    }

    public List<Book> getBooksOrderByName () {
        return bookRepository.findAllByOrderByNameAsc();
    }
    public List<Book> getBooksOrderByIsbn () {
        return bookRepository.findAllByOrderByIsbnAsc();
    }

}
