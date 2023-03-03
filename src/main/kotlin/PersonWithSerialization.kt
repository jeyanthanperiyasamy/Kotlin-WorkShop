import kotlinx.serialization.Serializable

@Serializable
data class PersonWithSerialization(val firstname: String, val lastname: String, val age: Int?)
