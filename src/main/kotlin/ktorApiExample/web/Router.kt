package ktorApiExample.web

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import ktorApiExample.core.application.usecases.findAllUsers.FindAllUsersUsecase
import ktorApiExample.core.application.usecases.findAllUsers.FindAllUsersUsecaseRequest

fun Routing.users(findAllUsersUsecase: FindAllUsersUsecase) {
    route("users") {
        get {
            val request = FindAllUsersUsecaseRequest()
            val response = findAllUsersUsecase.invoke(request)
            call.respond(response)
        }
    }
}