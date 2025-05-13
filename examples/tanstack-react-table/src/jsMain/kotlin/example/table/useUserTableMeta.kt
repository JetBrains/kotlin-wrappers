package example.table

import example.table.selection.useTableSelection
import tanstack.react.table.useTableMeta
import tanstack.table.core.TableMeta

internal fun useUserTableMeta(): TableMeta {
    val selection = useTableSelection()

    return useTableMeta(
        selection,
    )
}
