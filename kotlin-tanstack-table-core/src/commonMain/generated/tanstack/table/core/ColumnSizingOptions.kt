// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface ColumnSizingOptions {
    /**
     * Determines when the columnSizing state is updated. `onChange` updates the state when the user is dragging the resize handle. `onEnd` updates the state when the user releases the resize handle.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#columnresizemode)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val columnResizeMode: ColumnResizeMode?

    /**
     * Enables or disables column resizing for the column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#enablecolumnresizing)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val enableColumnResizing: Boolean?

    /**
     * Enables or disables right-to-left support for resizing the column. defaults to 'ltr'.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#columnResizeDirection)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val columnResizeDirection: ColumnResizeDirection?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.columnSizing` changes. This overrides the default internal state management, so you will also need to supply `state.columnSizing` from your own managed state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#oncolumnsizingchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val onColumnSizingChange: OnChangeFn<ColumnSizingState>?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.columnSizingInfo` changes. This overrides the default internal state management, so you will also need to supply `state.columnSizingInfo` from your own managed state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#oncolumnsizinginfochange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val onColumnSizingInfoChange: OnChangeFn<ColumnSizingInfoState>?
}
