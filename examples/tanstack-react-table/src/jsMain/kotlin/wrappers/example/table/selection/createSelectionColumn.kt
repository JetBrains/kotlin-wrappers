package wrappers.example.table.selection

import js.objects.jso
import react.create
import tanstack.table.core.ColumnDef
import tanstack.table.core.ColumnDefTemplate
import tanstack.table.core.StringOrTemplateHeader

internal val EMPTY_SELECTION: SelectedKeys = emptySet()
internal typealias SelectedKeys = Set<String>

internal fun <T : Any> createSelectionColumn(): ColumnDef<T, String> =
    jso {
        id = "selection"
        size = 32
        header = StringOrTemplateHeader(
            ColumnDefTemplate { context ->
                val keys = context.table.getRowModel().rows
                    .map { it.id }
                    .toSet()

                SelectionCell.create {
                    value = keys
                }
            }
        )
        cell = ColumnDefTemplate { context ->
            val keys = setOf(context.cell.row.id)

            SelectionCell.create {
                value = keys
            }
        }
    }
