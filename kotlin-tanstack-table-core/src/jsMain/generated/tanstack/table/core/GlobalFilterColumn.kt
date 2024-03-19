// Automatically generated - do not modify!

package tanstack.table.core

external interface GlobalFilterColumn {
    /**
     * Returns whether or not the column can be **globally** filtered. Set to `false` to disable a column from being scanned during global filtering.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getcanglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getCanGlobalFilter: () -> Boolean
}
