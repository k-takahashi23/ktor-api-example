package ktorApiExample.core.application.usecases.findUserById

import ktorApiExample.core.application.seedwork.UsecaseRequest

data class FindUserByIdUsecaseRequest (
  val id: String
): UsecaseRequest

