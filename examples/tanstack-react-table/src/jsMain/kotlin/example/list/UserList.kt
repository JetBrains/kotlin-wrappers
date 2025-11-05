package example.list

import example.table.UserTable
import react.FC
import react.dom.html.ReactHTML.div
import react.invoke

val UserList = FC {
    div {
        CreateUserButton()

        UserTable()
    }
}
