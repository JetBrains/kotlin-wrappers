package wrappers.example.list

import js.objects.jso
import react.FC
import react.dom.html.ReactHTML.button
import wrappers.example.hooks.useCreateUser
import kotlin.random.Random.Default.nextInt

val CreateUserButton = FC {
    val createUser = useCreateUser()

    button {
        onClick = { createUser(jso { id = "${nextInt()}" }) }

        +"Create New"
    }
}
