// Automatically generated - do not modify!

package tanstack.table.core

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface VisibilityInstance<TData : RowData> {
    /**
     * If column pinning, returns a flat array of leaf-node columns that are visible in the unpinned/center portion of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#getcentervisibleleafcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val getCenterVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * Returns whether all columns are visible
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#getisallcolumnsvisible)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val getIsAllColumnsVisible: () -> Boolean

    /**
     * Returns whether any columns are visible
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#getissomecolumnsvisible)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val getIsSomeColumnsVisible: () -> Boolean

    /**
     * If column pinning, returns a flat array of leaf-node columns that are visible in the left portion of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#getleftvisibleleafcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val getLeftVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * If column pinning, returns a flat array of leaf-node columns that are visible in the right portion of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#getrightvisibleleafcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val getRightVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * Returns a handler for toggling the visibility of all columns, meant to be bound to a `input[type=checkbox]` element.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#gettoggleallcolumnsvisibilityhandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val getToggleAllColumnsVisibilityHandler: () -> (event: Any) -> Unit

    /**
     * Returns a flat array of columns that are visible, including parent columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#getvisibleflatcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val getVisibleFlatColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * Returns a flat array of leaf-node columns that are visible.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#getvisibleleafcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val getVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * Resets the column visibility state to the initial state. If `defaultState` is provided, the state will be reset to `{}`
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#resetcolumnvisibility)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val resetColumnVisibility: (defaultState: Boolean?) -> Unit

    /**
     * Sets or updates the `state.columnVisibility` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#setcolumnvisibility)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val setColumnVisibility: (updater: Updater<VisibilityState>) -> Unit

    /**
     * Toggles the visibility of all columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#toggleallcolumnsvisible)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    val toggleAllColumnsVisible: (value: Boolean?) -> Unit
}
