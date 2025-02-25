package wrappers.example.table

import js.array.ReadonlyArray
import js.objects.jso
import tanstack.table.core.ColumnDef
import tanstack.table.core.StringOrTemplateHeader
import wrappers.example.entities.User
import wrappers.example.hooks.useUsers
import wrappers.example.table.selection.createSelectionColumn
import wrappers.example.table.simple.TableInstance
import wrappers.example.table.simple.useSimpleTable

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

internal fun useUsersTable(): TableInstance<User> {
    val users = useUsers()
    val tableMeta = useTableMeta()

    val table = useSimpleTable(
        data = users,
        columns = COLUMNS,
        meta = tableMeta,
    )

    return table
}
