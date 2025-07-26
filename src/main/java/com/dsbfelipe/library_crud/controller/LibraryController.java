package com.dsbfelipe.library_crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dsbfelipe.library_crud.facade.LibraryFacade;
import com.dsbfelipe.library_crud.model.Book;
import com.dsbfelipe.library_crud.model.Borrowing;
import com.dsbfelipe.library_crud.model.User;
import com.dsbfelipe.library_crud.strategy.FilterAllStrategy;
import com.dsbfelipe.library_crud.strategy.FilterByAuthorStrategy;
import com.dsbfelipe.library_crud.strategy.FilterByAvailabilityStrategy;

@RestController
@RequestMapping(value = "/book")
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
  public Borrowing borrowBook(@RequestBody Long userId, @RequestParam Long isbn) {
    return facade.borrowBook(userId, isbn);
  }

  @GetMapping("/books/filter")
  public List<Book> filterBooks(@RequestParam String filter, @RequestParam(required = false) String value) {
    switch (filter) {
      case "author":
        facade.setFilterBookStrategy(new FilterByAuthorStrategy());
        break;
      case "availability":
        facade.setFilterBookStrategy(new FilterByAvailabilityStrategy());
        break;
      default:
        facade.setFilterBookStrategy(new FilterAllStrategy());
    }
    return facade.filterBooks(value);
  }

  @GetMapping("/borrowings")
  public List<Borrowing> listBorrowings() {
    return facade.listBorrowings();
  }
}
