// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface ColumnSizingInstance {
    /**
     * If pinning, returns the total size of the center portion of the table by calculating the sum of the sizes of all unpinned/center leaf-columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#getcentertotalsize)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val getCenterTotalSize: () -> Int

    /**
     * Returns the total size of the left portion of the table by calculating the sum of the sizes of all left leaf-columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#getlefttotalsize)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val getLeftTotalSize: () -> Int

    /**
     * Returns the total size of the right portion of the table by calculating the sum of the sizes of all right leaf-columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#getrighttotalsize)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val getRightTotalSize: () -> Int

    /**
     * Returns the total size of the table by calculating the sum of the sizes of all leaf-columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#gettotalsize)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val getTotalSize: () -> Int

    /**
     * Resets column sizing to its initial state. If `defaultState` is `true`, the default state for the table will be used instead of the initialValue provided to the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#resetcolumnsizing)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val resetColumnSizing: (defaultState: Boolean?) -> Unit

    /**
     * Resets column sizing info to its initial state. If `defaultState` is `true`, the default state for the table will be used instead of the initialValue provided to the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#resetheadersizeinfo)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val resetHeaderSizeInfo: (defaultState: Boolean?) -> Unit

    /**
     * Sets the column sizing state using an updater function or a value. This will trigger the underlying `onColumnSizingChange` function if one is passed to the table options, otherwise the state will be managed automatically by the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#setcolumnsizing)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val setColumnSizing: (updater: Updater<ColumnSizingState>) -> Unit

    /**
     * Sets the column sizing info state using an updater function or a value. This will trigger the underlying `onColumnSizingInfoChange` function if one is passed to the table options, otherwise the state will be managed automatically by the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#setcolumnsizinginfo)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val setColumnSizingInfo: (updater: Updater<ColumnSizingInfoState>) -> Unit
}
