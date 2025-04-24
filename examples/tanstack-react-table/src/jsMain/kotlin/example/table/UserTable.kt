package example.table

import example.entities.User
import example.table.selection.SelectionContext
import example.table.selection.selection
import example.table.simple.SimpleTable
import example.table.simple.SimpleTableProps
import react.FC

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
