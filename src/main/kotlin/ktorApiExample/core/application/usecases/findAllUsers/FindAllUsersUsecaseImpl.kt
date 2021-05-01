package ktorApiExample.core.application.usecases.findAllUsers

import ktorApiExample.core.domain.repositories.UsersRepository

class FindAllUsersUsecaseImpl(private val usersRepository: UsersRepository): FindAllUsersUsecase {
    override fun invoke(request: FindAllUsersUsecaseRequest): FindAllUsersUsecaseResponse {
        val users = usersRepository.findAll()
        return FindAllUsersUsecaseResponse(data=users)
    }
}
