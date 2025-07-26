package com.dsbfelipe.library_crud.facade;

import java.util.List;
import org.springframework.stereotype.Service;
import com.dsbfelipe.library_crud.model.User;
import com.dsbfelipe.library_crud.model.Book;
import com.dsbfelipe.library_crud.model.Borrowing;
import com.dsbfelipe.library_crud.repository.BookRepository;
import com.dsbfelipe.library_crud.repository.BorrowingRepository;
import com.dsbfelipe.library_crud.repository.UserRepository;

@Service
public class LibraryFacade {
  private final BookRepository bookRepo;
  private final UserRepository userRepo;
  private final BorrowingRepository borrowingRepo;

  public LibraryFacade(BookRepository bookRepo, UserRepository userRepo, BorrowingRepository borrowingRepo) {
    this.bookRepo = bookRepo;
    this.userRepo = userRepo;
    this.borrowingRepo = borrowingRepo;
  }

  public Book addBook(Book book) {
    return bookRepo.save(book);
  }

  public User registerUser(User user) {
    return userRepo.save(user);
  }

  public Borrowing borrowBook(String userId, String isbn) {
    User user = userRepo.findById(userId).orElseThrow();
    Book book = bookRepo.findById(isbn).orElseThrow();

    if (book.isBorrowed()) throw new RuntimeException("Book already borrowed");
    book.setBorrowed(true);
    bookRepo.save(book);
    return borrowingRepo.save(new Borrowing(user, book));
  }

  public List<Borrowing> listBorrowings() {
    return borrowingRepo.findAll();
  }
}
