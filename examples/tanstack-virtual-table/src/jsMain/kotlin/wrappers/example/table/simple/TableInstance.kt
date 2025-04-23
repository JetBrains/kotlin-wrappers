package wrappers.example.table.simple

import js.array.ReadonlyArray
import tanstack.table.core.HeaderGroup
import tanstack.table.core.Row
import tanstack.table.core.Table
import tanstack.table.core.TableMeta

internal class TableInstance<D : Any>(
    val headerGroups: ReadonlyArray<HeaderGroup<D>>,
    val rows: ReadonlyArray<Row<D>>,
    val meta: TableMeta,
) {
    constructor(
        table: Table<D>,
    ) : this(
        headerGroups = table.getHeaderGroups(),
        rows = table.getRowModel().rows,
        meta = requireNotNull(table.options.meta),
    )
}
