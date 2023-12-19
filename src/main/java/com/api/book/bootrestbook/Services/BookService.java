package com.api.book.bootrestbook.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.Entities.Book;
import com.api.book.bootrestbook.dao.BookRepository;

@Component
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // get all books
    public List<Book> getBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    // get a particular book by id
    public Book getBookById(int id) {
        Book b1 = null;
        b1 = bookRepository.findById(id);
        return b1;
    }

    // add a new book
    public Book addBook(Book book) {
        Book b = bookRepository.save(book);
        return b;
    }

    // delete a particular book by id
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    // updating a particular book by id
    public Book updateBook(Book b, int id) {
        Book b1 = null;
        b.setId(id);
        b1 = bookRepository.save(b);
        return b1;
    }

}
