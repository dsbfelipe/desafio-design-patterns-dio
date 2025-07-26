package com.dsbfelipe.library_crud.strategy;

import com.dsbfelipe.library_crud.model.Book;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByAuthorStrategy implements FilterBookStrategy {
  public List<Book> filter(List<Book> books, String value) {
    return books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(value)).collect(Collectors.toList());
  }
}
