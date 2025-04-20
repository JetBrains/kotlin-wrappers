package wrappers.example.list

import react.FC
import react.dom.html.ReactHTML.button
import wrappers.example.entities.CreateUserOptions
import wrappers.example.hooks.useCreateUser
import kotlin.random.Random.Default.nextInt

val CreateUserButton = FC {
    val createUser = useCreateUser()

    button {
        onClick = {
            createUser(CreateUserOptions(id = "${nextInt()}"))
        }

        +"Create New"
    }
}
