package com.SpringBoot.pracs.service;

import com.SpringBoot.pracs.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    List<Book> bookList = new ArrayList<>();

    public BookService() {
        bookList.add(new Book("1", "Book1", "B011234"));
        bookList.add(new Book("2", "Book2", "B021234"));
        bookList.add(new Book("3", "Book3", "B031234"));
    }

    public List<Book> getAllBooks(){
        return bookList;
    }

    public Book getBook(String bookId) {
        Book book = null;
        for (Book b : bookList) {
            if (b.getBookId().equals(bookId)) {
                book = b;
                break;
            }
        }
        return book;
    }

}
