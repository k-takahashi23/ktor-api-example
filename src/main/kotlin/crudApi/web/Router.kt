package org.example.crudApi.app.web

import io.ktor.routing.Routing
import io.ktor.routing.delete
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.put
import io.ktor.routing.route
import org.example.crudApi.app.core.application.usecases.FindAllUsersUsecase

fun Routing.users(findAllUsersUsecase: FindAllUsersUsecase) {
  route("users") {
    get { findAllUsersUsecase.handle() }
  }
}