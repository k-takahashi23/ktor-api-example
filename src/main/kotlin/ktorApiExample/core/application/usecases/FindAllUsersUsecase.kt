package ktorApiExample.core.application.usecases

import ktorApiExample.core.domain.entities.User
import ktorApiExample.infrastructure.repositories.UsersRepository

class FindAllUsersUsecase(private val usersRepository: UsersRepository) {
    fun invoke(): List<User> {
        return usersRepository.findAll()
    }
}
