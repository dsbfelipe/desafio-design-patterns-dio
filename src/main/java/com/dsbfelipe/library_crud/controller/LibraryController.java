package com.dsbfelipe.library_crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.dsbfelipe.library_crud.facade.LibraryFacade;
import com.dsbfelipe.library_crud.model.Book;
import com.dsbfelipe.library_crud.model.Borrowing;
import com.dsbfelipe.library_crud.model.User;

public class LibraryController {
  private final LibraryFacade facade;

  public LibraryController(LibraryFacade facade) {
    this.facade = facade;
  }

  @PostMapping("/books")
  public Book addBook(@RequestBody Book book) {
    return facade.addBook(book);
  }
  
  @PostMapping("/users")
  public User addUser(@RequestBody User user) {
    return facade.registerUser(user);
  }

  @PostMapping("/borrow")
  public Borrowing borrowBook(@RequestBody String userId, @RequestParam String isbn) {
    return facade.borrowBook(userId, isbn);
  }

  @GetMapping("/emprestimos")
  public List<Borrowing> listBorrowings() {
    return facade.listBorrowings();
  }

}
