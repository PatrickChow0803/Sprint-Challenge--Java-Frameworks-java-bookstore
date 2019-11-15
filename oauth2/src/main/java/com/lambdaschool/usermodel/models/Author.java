package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lambdaschool.usermodel.logging.Loggable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
@Loggable
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long authorid;

    private String lastname;

    private String firstname;

    @ManyToMany
    @JoinTable (name = "authorbook",
                joinColumns = @JoinColumn(name = "authorid"),
                inverseJoinColumns = @JoinColumn(name = "bookid"))
    @JsonIgnoreProperties("authors")
    private List<Book> books = new ArrayList<>();


}
