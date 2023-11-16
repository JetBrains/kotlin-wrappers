// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnPinningOptions {
    /**
     * Enables/disables column pinning for the table. Defaults to `true`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#enablecolumnpinning)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var enableColumnPinning: Boolean?

    /**
     * Enables/disables all pinning for the table. Defaults to `true`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#enablepinning)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var enablePinning: Boolean?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.columnPinning` changes. This overrides the default internal state management, so you will also need to supply `state.columnPinning` from your own managed state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#oncolumnpinningchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/oncolumnpinningchange)
     */
    var onColumnPinningChange: OnChangeFn<ColumnPinningState>?
}
