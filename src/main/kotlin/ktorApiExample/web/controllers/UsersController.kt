package ktorApiExample.web.controllers

import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import ktorApiExample.core.application.usecases.addUserUsecase.AddUserUsecase
import ktorApiExample.core.application.usecases.addUserUsecase.AddUserUsecaseRequest
import ktorApiExample.core.application.usecases.findAllUsers.FindAllUsersUsecase
import ktorApiExample.core.application.usecases.findAllUsers.FindAllUsersUsecaseRequest
import ktorApiExample.core.application.usecases.findUserById.FindUserByIdUsecase
import ktorApiExample.core.application.usecases.findUserById.FindUserByIdUsecaseRequest
import org.kodein.di.instance
import org.kodein.di.ktor.di

fun Routing.users() {
    val findAllUsersUsecase by di().instance<FindAllUsersUsecase>()
    val addUserUsecase by di().instance<AddUserUsecase>()
    val findUserByIdUsecase by di().instance<FindUserByIdUsecase>()

    route("/api/v1/users") {
        get {
            val request = FindAllUsersUsecaseRequest()
            val response = findAllUsersUsecase.invoke(request)
            call.respond(response)
        }
        post {
            val request = call.receive<AddUserUsecaseRequest>()
            val response = addUserUsecase.invoke(request)
            call.respond(response)
        }
    }
    route("/api/v1/users/{id}") {
        get {
            val id = call.parameters["id"]
            if (id !is String) {
                throw Error("id is Not Found!")
            }
            val request = FindUserByIdUsecaseRequest(id)
            val response = findUserByIdUsecase.invoke(request)
            call.respond(response)
        }
    }
}