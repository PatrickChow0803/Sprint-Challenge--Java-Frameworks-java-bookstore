package com.lambdaschool.usermodel.models;

import com.lambdaschool.usermodel.logging.Loggable;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Loggable
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookid;

    @Column(nullable = false)
    private String booktitle;

    @Column(nullable = false,
            unique = true)
    private String ISBN;

    private int copy;

}
