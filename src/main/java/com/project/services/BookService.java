package com.project.services;

import com.project.dtos.BookDto;
import com.project.entities.Book;
import com.project.repositories.BookRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<BookDto> getAllBooks() {
        List<Book> books = this.bookRepo.findAll();
        System.out.println(books);
        List<BookDto> bookDtos = new ArrayList<>();
        for(Book book: books) {
            bookDtos.add(new BookDto(book.getName()));
        }
        return bookDtos;
    }
}
