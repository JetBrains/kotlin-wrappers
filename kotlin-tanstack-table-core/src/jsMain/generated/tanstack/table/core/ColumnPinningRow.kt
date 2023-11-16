// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface ColumnPinningRow<TData : RowData> {
    /**
     * Returns all center pinned (unpinned) leaf cells in the row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#getcentervisiblecells)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var getCenterVisibleCells: () -> ReadonlyArray<Cell<TData, *>>

    /**
     * Returns all left pinned leaf cells in the row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#getleftvisiblecells)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var getLeftVisibleCells: () -> ReadonlyArray<Cell<TData, *>>

    /**
     * Returns all right pinned leaf cells in the row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#getrightvisiblecells)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var getRightVisibleCells: () -> ReadonlyArray<Cell<TData, *>>
}
