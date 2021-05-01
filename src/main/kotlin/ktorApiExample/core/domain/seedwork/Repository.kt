package ktorApiExample.core.domain.seedwork

interface Repository<T: Entity> {
    fun findAll(): List<T>
    fun find(id: String): T?
    fun add(entity: T)
}