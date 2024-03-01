package com.project.controllers;

import com.project.dtos.BookDto;
import com.project.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("getBooks")
    public ResponseEntity<List<BookDto>> getAllBooks() {
        return ResponseEntity.ok().body(this.bookService.getAllBooks());
    }
}
