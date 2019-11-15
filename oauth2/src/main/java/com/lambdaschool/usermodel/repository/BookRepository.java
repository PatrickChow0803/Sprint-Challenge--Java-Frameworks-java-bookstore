package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
