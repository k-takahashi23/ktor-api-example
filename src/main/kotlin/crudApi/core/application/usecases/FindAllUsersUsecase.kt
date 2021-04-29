package org.example.crudApi.app.core.application.usecases

import org.example.crudApi.app.infrastructure.repositories.UsersRepository
import org.example.crudApi.app.core.domain.entities.User
import java.util.Base64

class FindAllUsersUsecase(private val usersRepository: UsersRepository) {
    fun handle(): List<User> {
        print("FindAllUsersUsecase.handle()");
        var users = usersRepository.findAll();
        return users;
    }
}
