// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface HeaderContext<TData : RowData, TValue> {
    /**
     * An instance of a column.
     */
    var column: Column<TData, TValue>

    /**
     * An instance of a header.
     */
    var header: Header<TData, TValue>

    /**
     * The table instance.
     */
    var table: Table<TData>
}
