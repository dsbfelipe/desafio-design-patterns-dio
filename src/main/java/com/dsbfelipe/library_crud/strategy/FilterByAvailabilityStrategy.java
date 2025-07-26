package com.dsbfelipe.library_crud.strategy;

import java.util.List;
import java.util.stream.Collectors;

import com.dsbfelipe.library_crud.model.Book;

public class FilterByAvailabilityStrategy implements FilterBookStrategy{
  public List<Book> filter(List<Book> books, String value) {
    boolean available = Boolean.parseBoolean(value);
    return books.stream().filter(book -> book.isBorrowed() != available).collect(Collectors.toList());
  }
}
