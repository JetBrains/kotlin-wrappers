// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreRow<TData : RowData> {
    /**
     * The depth of the row (if nested or grouped) relative to the root row array.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#depth)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var depth: Int

    /**
     * Returns all of the cells for the row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#getallcells)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var getAllCells: () -> ReadonlyArray<Cell<TData, *>>

    /**
     * Returns the leaf rows for the row, not including any parent rows.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#getleafrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var getLeafRows: () -> ReadonlyArray<Row<TData>>

    /**
     * Returns the parent row for the row, if it exists.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#getparentrow)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var getParentRow: () -> Row<TData>

    /**
     * Returns the parent rows for the row, all the way up to a root row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#getparentrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var getParentRows: () -> ReadonlyArray<Row<TData>>

    /**
     * Returns a unique array of values from the row for a given columnId.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#getuniquevalues)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var getUniqueValues: (columnId: String) -> ReadonlyArray<Any? /* TValue */>

    /**
     * Returns the value from the row for a given columnId.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#getvalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var getValue: (columnId: String) -> Any? /* TValue */

    /**
     * The resolved unique identifier for the row resolved via the `options.getRowId` option. Defaults to the row's index (or relative index if it is a subRow).
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#id)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var id: String

    /**
     * The index of the row within its parent array (or the root data array).
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#index)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var index: Int

    /**
     * The original row object provided to the table. If the row is a grouped row, the original row object will be the first original in the group.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#original)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var original: TData

    /**
     * An array of the original subRows as returned by the `options.getSubRows` option.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#originalsubrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var originalSubRows: ReadonlyArray<TData>?

    /**
     * If nested, this row's parent row id.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#parentid)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var parentId: String?

    /**
     * Renders the value for the row in a given columnId the same as `getValue`, but will return the `renderFallbackValue` if no value is found.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#rendervalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var renderValue: (columnId: String) -> Any? /* TValue */

    /**
     * An array of subRows for the row as returned and created by the `options.getSubRows` option.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/row#subrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/rows)
     */
    var subRows: ReadonlyArray<Row<TData>>
}
