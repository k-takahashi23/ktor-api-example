package ktorApiExample

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ktorApiExample.web.controllers.users
import org.kodein.di.ktor.di

fun main() {
    embeddedServer(Netty, port = 8000) {
        di {
            bindServices()
        }
        install(ContentNegotiation) {
            json()
        }
        install(StatusPages) {
            exception<Throwable> {
                call.respond(HttpStatusCode.InternalServerError)
            }
        }
        install(Routing) {
            users()
        }
    }.start(true)
}