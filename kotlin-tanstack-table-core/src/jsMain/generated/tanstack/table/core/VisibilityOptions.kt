// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface VisibilityOptions {
    /**
     * Whether to enable column hiding. Defaults to `true`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#enablehiding)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    var enableHiding: Boolean?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.columnVisibility` changes. This overrides the default internal state management, so you will need to persist the state change either fully or partially outside of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#oncolumnvisibilitychange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    var onColumnVisibilityChange: OnChangeFn<VisibilityState>?
}
