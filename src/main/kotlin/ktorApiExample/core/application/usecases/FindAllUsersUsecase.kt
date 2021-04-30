package ktorApiExample.core.application.usecases

import kotlinx.serialization.Serializable
import ktorApiExample.core.application.seedwork.Usecase
import ktorApiExample.core.domain.entities.User
import ktorApiExample.infrastructure.repositories.UsersRepository

@Serializable
data class FindAllUsersUsecaseResponse(
    val data: List<User>
)

class FindAllUsersUsecase(private val usersRepository: UsersRepository): Usecase {
    override fun invoke(request: Any): Any {
        val users = usersRepository.findAll()
        return FindAllUsersUsecaseResponse(data=users)
    }
}
