package example.table

import example.entities.User
import example.hooks.useUsers
import example.table.selection.createSelectionColumn
import example.table.simple.TableInstance
import example.table.simple.useSimpleTable
import js.array.ReadonlyArray
import js.objects.unsafeJso
import tanstack.table.core.ColumnDef
import tanstack.table.core.StringOrTemplateHeader

private val COLUMNS: ReadonlyArray<ColumnDef<User, String>> = arrayOf(
    createSelectionColumn(),
    unsafeJso {
        id = "name"
        header = StringOrTemplateHeader("Name")
        accessorFn = { user, _ -> user.name }
    },
    unsafeJso {
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
