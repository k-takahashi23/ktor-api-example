package ktorApiExample.core.application.usecases.addUserUsecase

import ktorApiExample.core.domain.entities.User
import ktorApiExample.core.domain.repositories.UsersRepository

class AddUserUsecaseImpl(private val usersRepository: UsersRepository): AddUserUsecase {
    override fun invoke(request: AddUserUsecaseRequest): AddUserUsecaseResponse {
        val user = User("userId1", request.name, request.email)
        usersRepository.add(user)
        return AddUserUsecaseResponse(data=user)
    }
}
