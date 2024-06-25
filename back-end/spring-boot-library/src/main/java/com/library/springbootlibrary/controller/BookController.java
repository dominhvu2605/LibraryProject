package com.library.springbootlibrary.controller;

import com.library.springbootlibrary.entity.Book;
import com.library.springbootlibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/books")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/secure/ischeckedout/byuser")
    public Boolean checkoutBookById(@RequestParam Long bookId) {
        String userEmail = "dominhvu1204@gmail.com";
        return bookService.checkoutBookByUser(userEmail, bookId);
    }

    @GetMapping("/secure/currentloans/count")
    public int currentLoansCount(){
        String userEmail = "dominhvu1204@gmail.com";
        return bookService.currentLoansCount(userEmail);
    }

    @PutMapping("/secure/checkout")
    public Book checkoutBook(@RequestParam Long bookId) throws Exception {
        String userEmail = "dominhvu1204@gmail.com";
        return bookService.checkoutBook(userEmail, bookId);
    }
}
