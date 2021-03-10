package com.apt.javaProject.CrudWebApp.repos;

import com.apt.javaProject.CrudWebApp.domains.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
