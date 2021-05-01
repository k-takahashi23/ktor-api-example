package ktorApiExample.core.application.usecases.addUserUsecase

import kotlinx.serialization.Serializable
import ktorApiExample.core.application.seedwork.UsecaseRequest

@Serializable
data class AddUserUsecaseRequest(
    val name: String,
    val email: String,
): UsecaseRequest

