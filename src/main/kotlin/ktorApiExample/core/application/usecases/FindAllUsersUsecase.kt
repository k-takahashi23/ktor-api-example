package ktorApiExample.core.application.usecases

import ktorApiExample.core.domain.entities.User
import ktorApiExample.infrastructure.repositories.UsersRepository

class FindAllUsersUsecase(private val usersRepository: UsersRepository) {
    fun handle(): List<User> {
        print("FindAllUsersUsecase.handle()")
        return usersRepository.findAll()
    }
}
