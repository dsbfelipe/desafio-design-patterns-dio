package com.dsbfelipe.library_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dsbfelipe.library_crud.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}
