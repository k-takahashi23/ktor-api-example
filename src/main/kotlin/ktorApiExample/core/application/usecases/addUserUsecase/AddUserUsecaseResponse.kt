package ktorApiExample.core.application.usecases.addUserUsecase

import kotlinx.serialization.Serializable
import ktorApiExample.core.application.seedwork.UsecaseResponse
import ktorApiExample.core.domain.entities.User

@Serializable
data class AddUserUsecaseResponse(
    val data: User
): UsecaseResponse