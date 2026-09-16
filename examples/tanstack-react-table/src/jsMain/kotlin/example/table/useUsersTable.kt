package example.table

import example.entities.User
import example.hooks.useUsers
import example.table.base.TableInstance
import example.table.base.useTable
import example.table.selection.createSelectionColumn
import js.array.ReadonlyArray
import tanstack.table.core.ColumnDef
import tanstack.table.core.StringOrTemplateHeader

private val COLUMNS: ReadonlyArray<ColumnDef<User, String>> = arrayOf(
    createSelectionColumn(),
    ColumnDef(
        id = "name",
        header = StringOrTemplateHeader("Name"),
        accessorFn = { user, _ -> user.name },
    ),
    ColumnDef(
        id = "email",
        header = StringOrTemplateHeader("Email"),
        accessorFn = { user, _ -> user.email },
    ),
)

internal fun useUsersTable(): TableInstance<User> {
    val users = useUsers()
    val meta = useUserTableMeta()

    val table = useTable(
        data = users,
        columns = COLUMNS,
        meta = meta,
    )

    return table
}
