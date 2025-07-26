package com.dsbfelipe.library_crud.strategy;

import java.util.List;

import com.dsbfelipe.library_crud.model.Book;

public class FilterAllStrategy implements FilterBookStrategy {
  public List<Book> filter(List<Book> books, String value) {
    return books;
  }
}
