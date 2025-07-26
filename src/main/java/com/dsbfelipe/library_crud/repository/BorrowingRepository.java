package com.dsbfelipe.library_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dsbfelipe.library_crud.model.Borrowing;

public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {

}
