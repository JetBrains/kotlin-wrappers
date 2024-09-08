package wrappers.example.list

import js.objects.jso
import react.FC
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import wrappers.example.hooks.useCreateUser
import wrappers.example.table.UserTable
import kotlin.random.Random.Default.nextInt

val UserList = FC {
    val createUser = useCreateUser()

    div {
        button {
            onClick = { createUser(jso { id = "${nextInt()}" }) }

            +"Create New"
        }

        UserTable()
    }
}
