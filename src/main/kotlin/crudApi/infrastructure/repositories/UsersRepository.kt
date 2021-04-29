package org.example.crudApi.app.infrastructure.repositories

import org.example.crudApi.app.core.domain.entities.User

class UsersRepository {
  fun findAll(): List<User> {
    print("UsersRepository.findAll()");
    return listOf(User("id1", "田中太郎", "tanaka@mail.com"));
  }
}
