package com.apt.javaProject.CrudWebApp.domains;

import javax.persistence.*;

@Entity
@Table(name="BOOKS")
public class Book {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="author")
    private String author;

    @Column(name="ISDN")
    private String isdn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsdn() {
        return isdn;
    }

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }
}
