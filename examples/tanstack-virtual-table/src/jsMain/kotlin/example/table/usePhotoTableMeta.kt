package example.table

import example.components.table.selection.useTableSelection
import tanstack.react.table.useTableMeta
import tanstack.table.core.TableMeta

internal fun usePhotoTableMeta(): TableMeta {
    val selection = useTableSelection()

    return useTableMeta(
        selection,
    )
}
