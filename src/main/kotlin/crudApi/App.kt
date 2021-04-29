package org.example.crudApi.app

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.example.crudApi.app.web.*
import org.example.crudApi.app.core.application.usecases.FindAllUsersUsecase
import org.example.crudApi.app.infrastructure.repositories.UsersRepository

fun main() {
  val usersRepository = UsersRepository();
  val findAllUsersUsecase = FindAllUsersUsecase(usersRepository);
  
  embeddedServer(Netty, port = 8000) {
    install(Routing) {
      users(findAllUsersUsecase)
    }
  }.start(true)
}