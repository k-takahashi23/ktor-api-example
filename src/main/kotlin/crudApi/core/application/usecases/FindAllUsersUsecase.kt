package crudApi.core.application.usecases

import crudApi.core.domain.entities.User
import crudApi.infrastructure.repositories.UsersRepository

class FindAllUsersUsecase(private val usersRepository: UsersRepository) {
    fun handle(): List<User> {
        print("FindAllUsersUsecase.handle()")
        return usersRepository.findAll()
    }
}
