package com.dsbfelipe.library_crud.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "borrowing")
public class Borrowing {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private User user;

  @ManyToOne
  private Book book;

  private LocalDate borrowingDate;

  public Borrowing(){}

  public Borrowing(User user, Book book) {
    this.user = user;
    this.book = book;
  }

  public Long getId() {
    return id;
  }

  public User getUser() {
    return user;
  }

  public Book getBook() {
    return book;
  }

  public LocalDate getBorrowingDate() {
    return borrowingDate;
  }  
}
