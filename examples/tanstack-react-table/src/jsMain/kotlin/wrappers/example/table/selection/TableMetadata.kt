package wrappers.example.table.selection

import preact.signals.core.Signal
import tanstack.table.core.RowData
import tanstack.table.core.Table
import tanstack.table.core.TableMeta
import tanstack.table.core.TableOptionsResolved
import wrappers.example.entities.User

internal external interface TableMetadata : TableMeta<User> {
    var selection: Signal<SelectedKeys>
}

internal fun <T : RowData> Table<T>.getMeta(): TableMetadata =
    options.unsafeCast<TableOptionsResolved<T>>()
        .meta.unsafeCast<TableMetadata>()
