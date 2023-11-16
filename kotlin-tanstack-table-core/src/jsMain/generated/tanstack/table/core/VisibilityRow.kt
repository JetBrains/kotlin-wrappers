// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface VisibilityRow<TData : RowData> {
    /**
     * Returns an array of cells that account for column visibility for the row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#getvisiblecells)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    var getVisibleCells: () -> ReadonlyArray<Cell<TData, *>>
}
