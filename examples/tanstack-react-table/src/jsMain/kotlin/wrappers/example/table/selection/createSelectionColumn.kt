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
                SelectionCell.create {
                    value = context.table.options.meta?.getSelection()

                    keys = context.table.getRowModel().rows
                        .map { it.id }
                        .toSet()
                }
            }
        )
        cell = ColumnDefTemplate { context ->
            SelectionCell.create {
                value = context.table.options.meta?.getSelection()

                keys = setOf(context.cell.row.id)
            }
        }
    }
