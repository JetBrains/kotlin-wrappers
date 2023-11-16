// Automatically generated - do not modify!

package tanstack.table.core

external interface RowSelectionOptions<TData : RowData> {
    /**
     * - Enables/disables multiple row selection for all rows in the table OR
     * - A function that given a row, returns whether to enable/disable multiple row selection for that row's children/grandchildren
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#enablemultirowselection)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var enableMultiRowSelection: (((row: Row<TData>) -> Boolean))?

    /**
     * - Enables/disables row selection for all rows in the table OR
     * - A function that given a row, returns whether to enable/disable row selection for that row
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#enablerowselection)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var enableRowSelection: (((row: Row<TData>) -> Boolean))?

    /**
     * Enables/disables automatic sub-row selection when a parent row is selected, or a function that enables/disables automatic sub-row selection for each row.
     * (Use in combination with expanding or grouping features)
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#enablesubrowselection)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var enableSubRowSelection: (((row: Row<TData>) -> Boolean))?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.rowSelection` changes. This overrides the default internal state management, so you will need to persist the state change either fully or partially outside of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#onrowselectionchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var onRowSelectionChange: OnChangeFn<RowSelectionState>?
}
