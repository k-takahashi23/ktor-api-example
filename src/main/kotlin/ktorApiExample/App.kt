package ktorApiExample

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ktorApiExample.core.application.usecases.findAllUsers.FindAllUsersUsecaseImpl
import ktorApiExample.core.application.usecases.findUserById.FindUserByIdUsecaseImpl
import ktorApiExample.infrastructure.repositories.UsersRepositoryImpl
import ktorApiExample.web.users

fun main() {
    val usersRepository = UsersRepositoryImpl()
    val findAllUsersUsecase = FindAllUsersUsecaseImpl(usersRepository)
    val findUserByIdUsecase = FindUserByIdUsecaseImpl(usersRepository)

    embeddedServer(Netty, port = 8000) {
        install(ContentNegotiation) {
            json()
        }
        install(Routing) {
            users(findAllUsersUsecase, findUserByIdUsecase)
        }
    }.start(true)
}