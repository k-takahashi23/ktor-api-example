package ktorApiExample

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ktorApiExample.web.users
import org.kodein.di.ktor.di

fun main() {
    embeddedServer(Netty, port = 8000) {
        install(ContentNegotiation) {
            json()
        }
        di {
            bindServices()
        }
        install(Routing) {
            users()
        }
    }.start(true)
}