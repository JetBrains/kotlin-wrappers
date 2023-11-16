// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnOrderOptions {
    /**
     * If provided, this function will be called with an `updaterFn` when `state.columnOrder` changes. This overrides the default internal state management, so you will need to persist the state change either fully or partially outside of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-ordering#oncolumnorderchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-ordering)
     */
    var onColumnOrderChange: OnChangeFn<ColumnOrderState>?
}
