package ktorApiExample.web

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

fun Routing.users(
    findAllUsersUsecase: FindAllUsersUsecase,
    addUserUsecase: AddUserUsecase,
    findUserByIdUsecase: FindUserByIdUsecase
) {
    route("/users") {
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
    route("/users/{id}") {
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