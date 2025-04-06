// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface HeaderContext<TData : RowData, TValue> {
    /**
     * An instance of a column.
     */
    val column: Column<TData, TValue>

    /**
     * An instance of a header.
     */
    val header: Header<TData, TValue>

    /**
     * The table instance.
     */
    val table: Table<TData>
}
