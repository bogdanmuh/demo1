package com.example.demo.controller;

import com.example.demo.domain.Author;

import com.example.demo.domain.Book;
import com.example.demo.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/author")
@AllArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping
    public void save (@RequestBody Author author) {
        authorService.save(author);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {
        authorService.delete(id);
    }

    @PutMapping
    public void updateBook (@RequestBody Author author) {
        authorService.update(author);
    }

    @GetMapping("/all")
    public List<Author> getBooks () {
        return authorService.getAuthors();
    }

}
