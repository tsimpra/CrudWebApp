package com.apt.javaProject.CrudWebApp.controllers;

import com.apt.javaProject.CrudWebApp.domains.Book;
import com.apt.javaProject.CrudWebApp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    //Read

    @GetMapping(value="/books")
    public List<Book> showBooks(){
        return bookService.getBooks();
    }

    @GetMapping(value="/book/{id}")
    public Book showBook(@PathVariable long id){
        return bookService.getBook(id);
    }

    //Create

    @PostMapping(value="/add-book")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    //Update

    @PostMapping(value = "/update-book")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

}
