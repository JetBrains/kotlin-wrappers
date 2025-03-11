package wrappers.example.table

import react.FC
import wrappers.example.table.selection.SelectionContext
import wrappers.example.table.selection.selection
import wrappers.example.table.simple.SimpleTable

internal val PhotoTable = FC {
    val table = usePhotoTable()

    SelectionContext(table.meta.selection) {
        SimpleTable {
            headerGroups = table.headerGroups
            rows = table.rows
        }
    }
}
