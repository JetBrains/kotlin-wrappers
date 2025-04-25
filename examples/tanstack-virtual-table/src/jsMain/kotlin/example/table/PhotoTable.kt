package example.table

import example.components.table.base.Table
import example.components.table.selection.SelectionContext
import example.components.table.selection.selection
import react.FC

internal val PhotoTable = FC {
    val table = usePhotoTable()

    SelectionContext(table.meta.selection) {
        Table {
            headerGroups = table.headerGroups
            rows = table.rows
        }
    }
}
