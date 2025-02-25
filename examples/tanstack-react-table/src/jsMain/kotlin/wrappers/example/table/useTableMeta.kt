package wrappers.example.table

import js.objects.PropertyKey
import js.objects.recordOf
import react.use.useConstant
import tanstack.table.core.TableMeta
import wrappers.example.table.selection.useTableSelection

internal fun useTableMeta(): TableMeta {
    val selection = useTableSelection()

    return useConstant {
        createMeta(
            selection,
        )
    }
}

private fun createMeta(
    vararg items: Pair<PropertyKey, Any>,
): TableMeta =
    recordOf(*items)
