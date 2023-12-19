package com.api.book.bootrestbook.dao;

import com.api.book.bootrestbook.Entities.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findById() {
        Book expectedResult = new Book(238,"Rich Dad", "Napoleon");
        bookRepository.save(expectedResult);

        Book actualResult = bookRepository.findById(238);
        assertThat(actualResult.getId()).isEqualTo(expectedResult.getId());
    }

    @AfterEach
    void tearDown(){
        System.out.println("tearing down");
        bookRepository.deleteAll();
    }

    @BeforeEach
    void setUp(){
        System.out.println("setting up");
    }
}