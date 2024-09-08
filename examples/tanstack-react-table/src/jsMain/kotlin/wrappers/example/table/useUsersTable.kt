package wrappers.example.table

import js.array.ReadonlyArray
import js.objects.jso
import tanstack.react.table.useReactTable
import tanstack.table.core.ColumnDef
import tanstack.table.core.StringOrTemplateHeader
import tanstack.table.core.Table
import tanstack.table.core.getCoreRowModel
import wrappers.example.entities.User
import wrappers.example.hooks.useUsers

private val COLUMNS: ReadonlyArray<ColumnDef<User, String>> = arrayOf(
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
    val users = useUsers()

    return useReactTable(
        options = jso {
            data = users
            columns = COLUMNS
            getCoreRowModel = getCoreRowModel()
        }
    )
}
