package com.apt.javaProject.CrudWebApp.services;

import com.apt.javaProject.CrudWebApp.domains.Book;
import com.apt.javaProject.CrudWebApp.repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        Book originalBook = bookRepository.findById(book.getId()).get();
        originalBook.setName(book.getName());
        originalBook.setAuthor(book.getAuthor());
        originalBook.setIsdn(book.getIsdn());
        return bookRepository.save(originalBook);
    }

    @Override
    public void deleteBookWithId(long id) {
        Book originalBook = bookRepository.findById(id).get();
        bookRepository.delete(originalBook);
    }
}
