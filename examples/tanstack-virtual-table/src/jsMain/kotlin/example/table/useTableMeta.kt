package example.table

import example.table.selection.useTableSelection
import js.objects.recordOf
import react.use.useConstant
import tanstack.table.core.TableMeta

internal fun useTableMeta(): TableMeta {
    val selection = useTableSelection()

    return useConstant {
        recordOf(
            selection,
        )
    }
}
