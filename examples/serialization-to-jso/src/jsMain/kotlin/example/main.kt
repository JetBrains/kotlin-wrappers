package example

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToDynamic
import web.console.console

@ExperimentalSerializationApi
fun main() {
    val user = User(
        firstName = "John",
        lastName = "Doe",
        age = 42,
    )

    val data = Json.encodeToDynamic(User.serializer(), user)

    console.log(data)
}
