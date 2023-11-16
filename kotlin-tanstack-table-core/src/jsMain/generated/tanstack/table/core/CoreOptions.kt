// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreOptions<TData : RowData> {
    /**
     * Set this option to override any of the `autoReset...` feature options.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#autoresetall)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var autoResetAll: Boolean?

    /**
     * The array of column defs to use for the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#columns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var columns: ReadonlyArray<ColumnDef<TData, *>>

    /**
     * The data for the table to display. This array should match the type you provided to `table.setRowType<...>`. Columns can access this data via string/index or a functional accessor. When the `data` option changes reference, the table will reprocess the data.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#data)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var data: ReadonlyArray<TData>

    /**
     * Set this option to `true` to output all debugging information to the console.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#debugall)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var debugAll: Boolean?

    /**
     * Set this option to `true` to output column debugging information to the console.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#debugcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var debugColumns: Boolean?

    /**
     * Set this option to `true` to output header debugging information to the console.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#debugheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var debugHeaders: Boolean?

    /**
     * Set this option to `true` to output row debugging information to the console.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#debugrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var debugRows: Boolean?

    /**
     * Set this option to `true` to output table debugging information to the console.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#debugtable)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var debugTable: Boolean?

    /**
     * Default column options to use for all column defs supplied to the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#defaultcolumn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var defaultColumn: ColumnDef<TData, *> /* Partial */?

    /**
     * This required option is a factory for a function that computes and returns the core row model for the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getcorerowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var getCoreRowModel: (table: Table<TData>) -> () -> RowModel<TData>

    /**
     * This optional function is used to derive a unique ID for any given row. If not provided the rows index is used (nested rows join together with `.` using their grandparents' index eg. `index.index.index`). If you need to identify individual rows that are originating from any server-side operations, it's suggested you use this function to return an ID that makes sense regardless of network IO/ambiguity eg. a userId, taskId, database ID field, etc.
     * @example getRowId: row => row.userId
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getrowid)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var getRowId: ((originalRow: TData, index: Int, parent: Row<TData>?) -> String)?

    /**
     * This optional function is used to access the sub rows for any given row. If you are using nested rows, you will need to use this function to return the sub rows object (or undefined) from the row.
     * @example getSubRows: row => row.subRows
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#getsubrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var getSubRows: ((originalRow: TData, index: Int) -> ReadonlyArray<TData>)?

    /**
     * Use this option to optionally pass initial state to the table. This state will be used when resetting various table states either automatically by the table (eg. `options.autoResetPageIndex`) or via functions like `table.resetRowSelection()`. Most reset function allow you optionally pass a flag to reset to a blank/default state instead of the initial state.
     *
     * Table state will not be reset when this object changes, which also means that the initial state object does not need to be stable.
     *
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#initialstate)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var initialState: InitialTableState?

    /**
     * This option is used to optionally implement the merging of table options.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#mergeoptions)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var mergeOptions: ((defaultOptions: TableOptions<TData>, options: TableOptions<TData> /* Partial */) -> TableOptions<TData>)?

    /**
     * You can pass any object to `options.meta` and access it anywhere the `table` is available via `table.options.meta`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#meta)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var meta: TableMeta<TData>?

    /**
     * The `onStateChange` option can be used to optionally listen to state changes within the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#onstatechange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var onStateChange: (updater: Updater<TableState>) -> Unit

    /**
     * Value used when the desired value is not found in the data.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#renderfallbackvalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var renderFallbackValue: Any

    /**
     * The `state` option can be used to optionally _control_ part or all of the table state. The state you pass here will merge with and overwrite the internal automatically-managed state to produce the final state for the table. You can also listen to state changes via the `onStateChange` option.
     * > Note: Any state passed in here will override both the internal state and any other `initialState` you provide.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#state)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var state: TableState /* Partial */
}
