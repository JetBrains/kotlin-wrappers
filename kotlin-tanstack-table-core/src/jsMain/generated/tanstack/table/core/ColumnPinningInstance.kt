// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface ColumnPinningInstance<TData : RowData> {
    /**
     * Returns all center pinned (unpinned) leaf columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#getcenterleafcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var getCenterLeafColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * Returns whether or not any columns are pinned. Optionally specify to only check for pinned columns in either the `left` or `right` position.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#getissomecolumnspinned)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var getIsSomeColumnsPinned: (position: ColumnPinningPosition?) -> Boolean

    /**
     * Returns all left pinned leaf columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#getleftleafcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var getLeftLeafColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * Returns all right pinned leaf columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#getrightleafcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var getRightLeafColumns: () -> ReadonlyArray<Column<TData, *>>

    /**
     * Resets the **columnPinning** state to `initialState.columnPinning`, or `true` can be passed to force a default blank state reset to `{ left: [], right: [], }`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#resetcolumnpinning)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var resetColumnPinning: (defaultState: Boolean?) -> Unit

    /**
     * Sets or updates the `state.columnPinning` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#setcolumnpinning)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var setColumnPinning: (updater: Updater<ColumnPinningState>) -> Unit
}
