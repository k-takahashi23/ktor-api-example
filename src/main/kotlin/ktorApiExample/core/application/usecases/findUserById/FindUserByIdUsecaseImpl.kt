package ktorApiExample.core.application.usecases.findUserById

import ktorApiExample.core.domain.entities.User
import ktorApiExample.core.domain.repositories.UsersRepository

class FindUserByIdUsecaseImpl(private val usersRepository: UsersRepository): FindUserByIdUsecase {
    override fun invoke(request: FindUserByIdUsecaseRequest): FindUserByIdUsecaseResponse {
        val user = usersRepository.find(request.id)
        return FindUserByIdUsecaseResponse(data=user)
    }
}
