package wrappers.example.table.selection

import preact.signals.core.Signal
import tanstack.table.core.RowData
import tanstack.table.core.Table
import tanstack.table.core.TableMeta
import wrappers.example.entities.User

internal external interface TableMetadata : TableMeta<User> {
    var selection: Signal<SelectedKeys>
}

internal fun <T : RowData> Table<T>.getMeta(): TableMetadata =
    options.meta.unsafeCast<TableMetadata>()
