package com.example.mongodbdockercompose.controller;

import com.example.mongodbdockercompose.dao.BookRepository;
import com.example.mongodbdockercompose.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
     private BookRepository repository;

    @PostMapping
    public Book displayBook(@RequestBody Book book){
        return repository.save(book);
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return  repository.findAll();
    }
}
