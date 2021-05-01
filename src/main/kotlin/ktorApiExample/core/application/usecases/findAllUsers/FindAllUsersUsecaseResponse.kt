package ktorApiExample.core.application.usecases.findAllUsers

import kotlinx.serialization.Serializable
import ktorApiExample.core.application.seedwork.UsecaseResponse
import ktorApiExample.core.domain.entities.User

@Serializable
data class FindAllUsersUsecaseResponse(
    val data: List<User>
): UsecaseResponse