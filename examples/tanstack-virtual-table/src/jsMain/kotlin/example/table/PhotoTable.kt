package example.table

import emotion.styled.styled
import example.table.selection.SelectionContext
import example.table.selection.selection
import example.table.simple.SimpleTable
import example.table.simple.TableStyles
import react.FC
import react.dom.html.ReactHTML.div

internal val PhotoTable = FC {
    val table = usePhotoTable()

    SelectionContext(table.meta.selection) {
        ParentContainer {
            TableStyles()

            SimpleTable {
                headerGroups = table.headerGroups
                rows = table.rows
            }
        }
    }
}

private val ParentContainer = div.styled()
