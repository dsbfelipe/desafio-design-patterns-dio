package com.dsbfelipe.library_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
  @Id
  private String id;
  private String name;

  public User(String id, String name) {
    this.id = id;
    this.name = name;
  }
  
  public String getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
