package com.example.demo.service.serviceImpl;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.repos.AuthorRepository;
import com.example.demo.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public Author save (Author author) {
        return authorRepository.save(author);
    }

    public void delete (Long id) {
        authorRepository.deleteById(id);
    }

    public void update (Author author) {
        authorRepository
                .findById(author.getId())
                .ifPresent(author1 -> {
                    author1.setFirstName(author.getFirstName());
                    author1.setLastName(author.getLastName());
                    author1.setSurName(author.getSurName());
                    authorRepository.save(author1);
                });
    }

    public List<Author> getAuthors () {
        return authorRepository.findAll();
    }

}
