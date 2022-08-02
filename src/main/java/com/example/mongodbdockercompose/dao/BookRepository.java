package com.example.mongodbdockercompose.dao;

import com.example.mongodbdockercompose.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
