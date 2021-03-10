package com.apt.javaProject.CrudWebApp.services;

import com.apt.javaProject.CrudWebApp.domains.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();

    Book getBook(long id);

    Book addBook(Book book);

    Book updateBook(Book book);
}
