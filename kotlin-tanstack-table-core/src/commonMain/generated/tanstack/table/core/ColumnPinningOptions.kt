// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface ColumnPinningOptions {
    /**
     * Enables/disables column pinning for the table. Defaults to `true`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-pinning#enablecolumnpinning)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-pinning)
     */
    val enableColumnPinning: Boolean?

    /**
     * @deprecated Use `enableColumnPinning` or `enableRowPinning` instead.
     * Enables/disables all pinning for the table. Defaults to `true`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-pinning#enablepinning)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-pinning)
     */
    val enablePinning: Boolean?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.columnPinning` changes. This overrides the default internal state management, so you will also need to supply `state.columnPinning` from your own managed state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-pinning#oncolumnpinningchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/oncolumnpinningchange)
     */
    val onColumnPinningChange: OnChangeFn<ColumnPinningState>?
}
