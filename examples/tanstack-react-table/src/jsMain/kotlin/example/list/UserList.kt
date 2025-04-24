package example.list

import example.table.UserTable
import react.FC
import react.dom.html.ReactHTML.div

val UserList = FC {
    div {
        CreateUserButton()

        UserTable()
    }
}
