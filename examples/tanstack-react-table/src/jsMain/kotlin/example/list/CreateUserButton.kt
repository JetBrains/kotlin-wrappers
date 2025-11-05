package example.list

import example.entities.CreateUserOptions
import example.hooks.useCreateUser
import react.FC
import react.dom.html.ReactHTML.button
import react.invoke
import react.unaryPlus
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
