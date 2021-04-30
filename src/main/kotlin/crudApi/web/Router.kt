package crudApi.web

import crudApi.core.application.usecases.FindAllUsersUsecase
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Routing.users(findAllUsersUsecase: FindAllUsersUsecase) {
  route("users") {
    get {
      val response = findAllUsersUsecase.handle()
      call.respond(response)
    }
  }
}