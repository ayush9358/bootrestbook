package com.api.book.bootrestbook.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.api.book.bootrestbook.Entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
    public Book findById(int id);
}