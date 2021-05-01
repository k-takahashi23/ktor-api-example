package ktorApiExample.infrastructure.repositories

import ktorApiExample.core.domain.entities.User
import ktorApiExample.core.domain.repositories.UsersRepository

class UsersRepositoryImpl: UsersRepository {
    override fun findAll(): List<User> {
        return listOf(User("id1", "田中太郎", "tanaka@mail.com"))
    }
}
