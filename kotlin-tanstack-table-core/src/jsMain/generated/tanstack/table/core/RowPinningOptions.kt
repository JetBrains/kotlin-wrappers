// Automatically generated - do not modify!

package tanstack.table.core

external interface RowPinningOptions<TData : RowData> {
    /**
     * Enables/disables row pinning for the table. Defaults to `true`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#enablerowpinning)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var enableRowPinning: (((row: Row<TData>) -> Boolean))?

    /**
     * When `false`, pinned rows will not be visible if they are filtered or paginated out of the table. When `true`, pinned rows will always be visible regardless of filtering or pagination. Defaults to `true`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#keeppinnedrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var keepPinnedRows: Boolean?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.rowPinning` changes. This overrides the default internal state management, so you will also need to supply `state.rowPinning` from your own managed state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#onrowpinningchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/onrowpinningchange)
     */
    var onRowPinningChange: OnChangeFn<RowPinningState>?
}
