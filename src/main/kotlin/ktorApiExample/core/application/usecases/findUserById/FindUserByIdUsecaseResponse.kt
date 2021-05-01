package ktorApiExample.core.application.usecases.findUserById

import kotlinx.serialization.Serializable
import ktorApiExample.core.application.seedwork.UsecaseResponse
import ktorApiExample.core.domain.entities.User

@Serializable
data class FindUserByIdUsecaseResponse(
    val data: User?
): UsecaseResponse