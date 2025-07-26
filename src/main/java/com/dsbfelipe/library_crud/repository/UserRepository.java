package com.dsbfelipe.library_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsbfelipe.library_crud.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
