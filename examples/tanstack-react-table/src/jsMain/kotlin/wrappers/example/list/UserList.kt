package wrappers.example.list

import react.FC
import react.dom.html.ReactHTML.div
import wrappers.example.table.UserTable
import wrappers.example.table.selection.TableSelectionModule

val UserList = FC {
    div {
        CreateUserButton()

        TableSelectionModule {
            UserTable()
        }
    }
}
