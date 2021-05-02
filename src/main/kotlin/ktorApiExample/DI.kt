package ktorApiExample

import ktorApiExample.core.application.usecases.addUserUsecase.AddUserUsecase
import ktorApiExample.core.application.usecases.addUserUsecase.AddUserUsecaseImpl
import ktorApiExample.core.application.usecases.findAllUsers.FindAllUsersUsecase
import ktorApiExample.core.application.usecases.findAllUsers.FindAllUsersUsecaseImpl
import ktorApiExample.core.application.usecases.findUserById.FindUserByIdUsecase
import ktorApiExample.core.application.usecases.findUserById.FindUserByIdUsecaseImpl
import ktorApiExample.core.domain.repositories.UsersRepository
import ktorApiExample.infrastructure.repositories.UsersRepositoryImpl
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

fun DI.MainBuilder.bindServices() {
    bind<UsersRepository>() with singleton { UsersRepositoryImpl() }
    bind<FindAllUsersUsecase>() with singleton { FindAllUsersUsecaseImpl(instance()) }
    bind<AddUserUsecase>() with singleton { AddUserUsecaseImpl(instance()) }
    bind<FindUserByIdUsecase>() with singleton { FindUserByIdUsecaseImpl(instance()) }
}