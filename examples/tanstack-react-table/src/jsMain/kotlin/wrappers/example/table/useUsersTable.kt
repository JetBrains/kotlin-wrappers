package wrappers.example.table

import js.array.ReadonlyArray
import js.objects.jso
import preact.signals.react.useSignal
import tanstack.react.table.useReactTable
import tanstack.table.core.ColumnDef
import tanstack.table.core.StringOrTemplateHeader
import tanstack.table.core.Table
import tanstack.table.core.getCoreRowModel
import wrappers.example.entities.User
import wrappers.example.hooks.useUsers
import wrappers.example.table.selection.EMPTY_SELECTION
import wrappers.example.table.selection.createSelectionColumn
import wrappers.example.table.selection.useTableMeta

private val COLUMNS: ReadonlyArray<ColumnDef<User, String>> = arrayOf(
    createSelectionColumn(),
    jso {
        id = "name"
        header = StringOrTemplateHeader("Name")
        accessorFn = { user, _ -> user.name }
    },
    jso {
        id = "email"
        header = StringOrTemplateHeader("Email")
        accessorFn = { user, _ -> user.email }
    },
)

fun useUsersTable(): Table<User> {
    val selection = useSignal(EMPTY_SELECTION)
    val tableMeta = useTableMeta(selection)

    val users = useUsers()

    return useReactTable(
        options = jso {
            data = users
            columns = COLUMNS
            getCoreRowModel = getCoreRowModel()
            meta = tableMeta
        }
    )
}
