// Automatically generated - do not modify!

package tanstack.table.core

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface CoreInstance<TData : RowData> {
    /**
     * Returns all columns in the table in their normalized and nested hierarchy.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getallcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val getAllColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * Returns all columns in the table flattened to a single level.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getallflatcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val getAllFlatColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * Returns all leaf-node columns in the table flattened to a single level. This does not include parent columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getallleafcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val getAllLeafColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * Returns a single column by its ID.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getcolumn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val getColumn: (columnId: String) -> Column<TData, *>

    /**
     * Returns the core row model before any processing has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getcorerowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val getCoreRowModel: () -> RowModel<TData>

    /**
     * Returns the row with the given ID.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getrow)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val getRow: (id: String, searchAll: Boolean?) -> Row<TData>

    /**
     * Returns the final model after all processing from other used features has been applied. This is the row model that is most commonly used for rendering.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val getRowModel: () -> RowModel<TData>

    /**
     * Call this function to get the table's current state. It's recommended to use this function and its state, especially when managing the table state manually. It is the exact same state used internally by the table for every feature and function it provides.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getstate)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val getState: () -> TableState

    /**
     * This is the resolved initial state of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#initialstate)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val initialState: TableState

    /**
     * A read-only reference to the table's current options.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#options)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val options: TableOptionsResolved<TData>

    /**
     * Call this function to reset the table state to the initial state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#reset)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val reset: () -> Unit

    /**
     * This function can be used to update the table options.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#setoptions)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val setOptions: (newOptions: Updater<TableOptionsResolved<TData>>) -> Unit

    /**
     * Call this function to update the table state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#setstate)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    val setState: (updater: Updater<TableState>) -> Unit
}
