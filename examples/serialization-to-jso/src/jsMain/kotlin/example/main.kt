package example

import web.console.console

fun main() {
    val user = User(
        firstName = "John",
        lastName = "Doe",
        age = 42,
    )

    console.log(user)
}
