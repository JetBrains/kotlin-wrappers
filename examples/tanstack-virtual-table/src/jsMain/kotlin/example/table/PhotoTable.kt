package example.table

import example.table.selection.SelectionContext
import example.table.selection.selection
import example.table.simple.SimpleTable
import react.FC

internal val PhotoTable = FC {
    val table = usePhotoTable()

    SelectionContext(table.meta.selection) {
        SimpleTable {
            headerGroups = table.headerGroups
            rows = table.rows
        }
    }
}
