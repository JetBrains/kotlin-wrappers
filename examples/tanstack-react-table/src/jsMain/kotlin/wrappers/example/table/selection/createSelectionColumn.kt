package wrappers.example.table.selection

import js.array.ReadonlyArray
import js.objects.jso
import preact.signals.core.Signal
import preact.signals.core.signal
import react.create
import tanstack.table.core.ColumnDef
import tanstack.table.core.ColumnDefTemplate
import tanstack.table.core.StringOrTemplateHeader

internal typealias SelectedKeys = ReadonlyArray<String>

internal val selectedKeys: Signal<SelectedKeys> = signal(emptyArray())

internal fun <T : Any> createSelectionColumn(): ColumnDef<T, String> =
    jso {
        id = "selection"
        size = 32
        header = StringOrTemplateHeader(
            ColumnDefTemplate { context ->
                val allRowIds = context.table.getRowModel().rows
                    .map { it.id }
                    .toTypedArray()

                SelectionHeader.create {
                    value = allRowIds
                }
            }
        )
        cell = ColumnDefTemplate { context ->
            val row = context.cell.row

            SelectionCell.create {
                value = row
            }
        }
    }
