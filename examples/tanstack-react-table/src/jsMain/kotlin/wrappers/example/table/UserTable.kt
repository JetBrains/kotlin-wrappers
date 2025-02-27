package wrappers.example.table

import react.FC
import wrappers.example.entities.User
import wrappers.example.table.selection.SelectionContext
import wrappers.example.table.selection.selection
import wrappers.example.table.simple.SimpleTable
import wrappers.example.table.simple.SimpleTableProps

internal val UserTable = FC {
    val table = useUsersTable()

    val clickHandler = useUserClickHandler()

    SelectionContext(table.meta.selection) {
        SimpleTable<SimpleTableProps<User>> {
            value = table
            onRowClick = clickHandler
        }
    }
}
