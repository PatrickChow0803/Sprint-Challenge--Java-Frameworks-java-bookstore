package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Author;
import com.lambdaschool.usermodel.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "authorService")
public class AuthorServiceImplementation implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }
}
