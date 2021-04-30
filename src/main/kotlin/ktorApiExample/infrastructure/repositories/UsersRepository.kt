package ktorApiExample.infrastructure.repositories

import ktorApiExample.core.domain.entities.User

class UsersRepository {
    fun findAll(): List<User> {
        return listOf(User("id1", "田中太郎", "tanaka@mail.com"))
    }
}
