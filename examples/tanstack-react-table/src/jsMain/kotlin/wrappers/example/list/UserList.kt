package wrappers.example.list

import react.FC
import react.dom.html.ReactHTML.div
import wrappers.example.table.UserTable

val UserList = FC {
    div {
        CreateUserButton()

        UserTable()
    }
}
