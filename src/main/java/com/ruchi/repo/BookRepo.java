package com.ruchi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruchi.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
