package com.suatogul.springbootcrudoperation.controller;

import com.suatogul.springbootcrudoperation.data.model.Books;
import com.suatogul.springbootcrudoperation.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {
@Autowired
    BooksService booksService;

    @GetMapping("/books")
    private List<Books> getAllBooks(){
       return booksService.getAllBooks();
    }
    @GetMapping("/book/{bookid}")
    private Books getBooks(@PathVariable("bookid") int bookid){
        return booksService.getBooksById(bookid);
    }
    @DeleteMapping("/book/{bookId}")
    private void deleteBook(@PathVariable("bookid") int bookid){
        booksService.delete(bookid);
    }
    @PostMapping("/books")
    private int saveBook(@RequestBody Books books){
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }
    @PutMapping("/books")
    private Books update(@RequestBody Books books){
        booksService.saveOrUpdate(books);
        return books;
    }
}
