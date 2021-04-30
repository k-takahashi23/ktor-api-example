package crudApi

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import crudApi.core.application.usecases.FindAllUsersUsecase
import crudApi.infrastructure.repositories.UsersRepository
import crudApi.web.users

fun main() {
  val usersRepository = UsersRepository()
  val findAllUsersUsecase = FindAllUsersUsecase(usersRepository)

  embeddedServer(Netty, port = 8000) {
    install(ContentNegotiation) {
      json()
    }
    install(Routing) {
      users(findAllUsersUsecase)
    }
  }.start(true)
}