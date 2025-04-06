// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface ExpandedOptions<TData : RowData> {
    /**
     * Enable this setting to automatically reset the expanded state of the table when expanding state changes.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#autoresetexpanded)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val autoResetExpanded: Boolean?

    /**
     * Enable/disable expanding for all rows.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#enableexpanding)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val enableExpanding: Boolean?

    /**
     * This function is responsible for returning the expanded row model. If this function is not provided, the table will not expand rows. You can use the default exported `getExpandedRowModel` function to get the expanded row model or implement your own.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getexpandedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val getExpandedRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?

    /**
     * If provided, allows you to override the default behavior of determining whether a row is currently expanded.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getisrowexpanded)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val getIsRowExpanded: ((row: Row<TData>) -> Boolean)?

    /**
     * If provided, allows you to override the default behavior of determining whether a row can be expanded.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getrowcanexpand)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val getRowCanExpand: ((row: Row<TData>) -> Boolean)?

    /**
     * Enables manual row expansion. If this is set to `true`, `getExpandedRowModel` will not be used to expand rows and you would be expected to perform the expansion in your own data model. This is useful if you are doing server-side expansion.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#manualexpanding)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val manualExpanding: Boolean?

    /**
     * This function is called when the `expanded` table state changes. If a function is provided, you will be responsible for managing this state on your own. To pass the managed state back to the table, use the `tableOptions.state.expanded` option.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#onexpandedchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val onExpandedChange: OnChangeFn<ExpandedState>?

    /**
     * If `true` expanded rows will be paginated along with the rest of the table (which means expanded rows may span multiple pages). If `false` expanded rows will not be considered for pagination (which means expanded rows will always render on their parents page. This also means more rows will be rendered than the set page size)
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#paginateexpandedrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val paginateExpandedRows: Boolean?
}
