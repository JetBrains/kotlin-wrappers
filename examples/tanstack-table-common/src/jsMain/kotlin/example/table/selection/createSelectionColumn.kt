package example.table.selection

import js.objects.unsafeJso
import react.create
import tanstack.table.core.ColumnDef
import tanstack.table.core.ColumnDefTemplate
import tanstack.table.core.StringOrTemplateHeader

fun <T : Any> createSelectionColumn(): ColumnDef<T, String> =
    unsafeJso {
        id = "selection"
        size = 32
        header = StringOrTemplateHeader(
            ColumnDefTemplate { context ->
                SelectionHeaderCell.create {
                    value = context.table.getRowModel().rows
                }
            }
        )
        cell = ColumnDefTemplate { context ->
            SelectionRowCell.create {
                value = context.cell.row
            }
        }
    }
