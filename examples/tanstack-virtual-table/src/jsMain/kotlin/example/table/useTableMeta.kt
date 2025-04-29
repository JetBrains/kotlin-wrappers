package example.table

import example.components.table.selection.useTableSelection
import example.components.table.styling.useRowClassName
import example.entities.Photo
import js.objects.recordOf
import react.use.useConstant
import tanstack.table.core.TableMeta
import web.cssom.ClassName

internal fun useTableMeta(): TableMeta {
    val selection = useTableSelection()
    val rowClassName = useRowClassName<Photo> { row, _ ->
        ClassName("row-${row.id}")
    }

    return useConstant {
        recordOf(
            selection,
            rowClassName,
        )
    }
}
