package com.example.demo.repos;

import com.example.demo.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository< Author, Long> { }
