package wrappers.example.table.selection

import js.objects.jso
import preact.signals.core.Signal
import react.create
import tanstack.table.core.ColumnDef
import tanstack.table.core.ColumnDefTemplate
import tanstack.table.core.StringOrTemplateHeader

internal typealias SelectedKeys = Set<String>
internal typealias Selection = Signal<SelectedKeys>

internal val EMPTY_SELECTION: SelectedKeys = emptySet()

internal fun <T : Any> createSelectionColumn(): ColumnDef<T, String> =
    jso {
        id = "selection"
        size = 32
        header = StringOrTemplateHeader(
            ColumnDefTemplate { context ->
                SelectionHeader.create {
                    selection = context.table.selection
                    value = context.table.getRowModel().rows
                }
            }
        )
        cell = ColumnDefTemplate { context ->
            SelectionCell.create {
                selection = context.table.selection
                value = context.cell.row.id
            }
        }
    }
