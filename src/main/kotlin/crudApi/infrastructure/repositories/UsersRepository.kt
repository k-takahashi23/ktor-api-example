package crudApi.infrastructure.repositories

import crudApi.core.domain.entities.User

class UsersRepository {
  fun findAll(): List<User> {
    print("UsersRepository.findAll()")
    return listOf(User("id1", "田中太郎", "tanaka@mail.com"))
  }
}
