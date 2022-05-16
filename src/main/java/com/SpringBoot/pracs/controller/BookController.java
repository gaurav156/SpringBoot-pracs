package com.SpringBoot.pracs.controller;

import com.SpringBoot.pracs.entity.Book;
import com.SpringBoot.pracs.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String home(){
        return "Spring Application Main";
    }
//    @RequestMapping(method = RequestMethod.GET, path = "/books")
@RequestMapping(method = RequestMethod.GET, path = "/books")
    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/books/{bookId}")
    public Book getBook(@PathVariable("bookId") String bookId){
        return bookService.getBook(bookId);
    }
}
