package example.table.simple

import tanstack.table.core.Row

internal typealias RowIdFn<TData> = (originalRow: TData, index: Int, parent: Row<TData>?) -> String

internal data class TableSettings<TData : Any>(
    val getRowId: RowIdFn<TData>?,
)
