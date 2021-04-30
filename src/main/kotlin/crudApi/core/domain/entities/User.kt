package crudApi.core.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class User(
  val id: String,
  val name: String,
  val email: String,
)
