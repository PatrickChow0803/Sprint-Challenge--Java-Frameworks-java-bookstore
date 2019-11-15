package com.lambdaschool.usermodel.models;

import com.lambdaschool.usermodel.logging.Loggable;

import javax.persistence.*;

@Entity
@Table(name = "sections")
@Loggable
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sectionid;

    @Column(nullable = false,
            unique = true)
    private String sectionname;

}
