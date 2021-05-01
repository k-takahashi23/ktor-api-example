package ktorApiExample.core.application.seedwork

interface Usecase<TRequest: UsecaseRequest, TResponse: UsecaseResponse> {
    fun invoke(request: TRequest): TResponse
}