package com.dsbfelipe.library_crud.strategy;

import java.util.List;

import com.dsbfelipe.library_crud.model.Book;

public interface FilterBookStrategy {
  List<Book> filter(List<Book> books, String value);
}
