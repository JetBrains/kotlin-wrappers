package example.table

import example.entities.User
import example.hooks.useUsers
import example.table.base.TableInstance
import example.table.base.useTable
import example.table.selection.createSelectionColumn
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
    val meta = useUserTableMeta()

    val table = useTable(
        data = users,
        columns = COLUMNS,
        meta = meta,
    )

    return table
}
