package ktorApiExample.core.domain.seedwork

interface Repository<T: Entity> {
    fun findAll(): List<T>
}