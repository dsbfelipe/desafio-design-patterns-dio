package com.dsbfelipe.library_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long isnb;
  private String title;
  private String author;
  private boolean borrowed;

  public Book(){}
  
  public Book(Long isnb, String title, String author) {
    this.isnb = isnb;
    this.title = title;
    this.author = author;
    this.borrowed = false;
  }

  public Long getIsnb() {
    return isnb;
  }

  public void setIsnb(Long isnb) {
    this.isnb = isnb;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public boolean isBorrowed() {
    return borrowed;
  }

  public void setBorrowed(boolean borrowed) {
    this.borrowed = borrowed;
  }
}
