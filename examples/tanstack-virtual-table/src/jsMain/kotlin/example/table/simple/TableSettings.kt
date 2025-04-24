package example.table.simple

import tanstack.table.core.Row

data class TableSettings<TData : Any>(
    val getRowId: ((originalRow: TData, index: Int, parent: Row<TData>?) -> String)?,
)
