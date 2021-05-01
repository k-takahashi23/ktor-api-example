package ktorApiExample.core.application.usecases.addUserUsecase

import ktorApiExample.core.domain.entities.User
import ktorApiExample.core.domain.repositories.UsersRepository
import java.util.*

class AddUserUsecaseImpl(private val usersRepository: UsersRepository): AddUserUsecase {
    override fun invoke(request: AddUserUsecaseRequest): AddUserUsecaseResponse {
        val newUserId = UUID.randomUUID().toString()
        val user = User(newUserId, request.name, request.email)
        usersRepository.add(user)
        return AddUserUsecaseResponse(data=user)
    }
}
