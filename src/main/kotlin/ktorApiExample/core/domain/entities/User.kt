package ktorApiExample.core.domain.entities

import kotlinx.serialization.Serializable
import ktorApiExample.core.domain.seedwork.Entity

@Serializable
data class User(
    val id: String,
    val name: String,
    val email: String,
): Entity
