package wrappers.example.table.simple

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.array.tupleOf
import react.useMemo
import tanstack.table.core.Row

internal fun useRows(
    rows: ReadonlyArray<Row<*>>,
): JsTuple2<ReadonlyArray<Row<*>>, String?> {
    val virtualOptions = useVirtualOptionsOrNull()
    val virtualizer = useTableVirtualizer()
    val virtualItems = virtualizer.getVirtualItems()
    val styles = useRowStyles(virtualItems, virtualizer.getTotalSize())

    return useMemo(virtualOptions, virtualItems, rows, styles) {
        val virtualRows = virtualItems
            .map { rows[it.index] }
            .toTypedArray()
            .takeIf { virtualOptions != null }

        tupleOf(virtualRows ?: rows, styles)
    }
}
