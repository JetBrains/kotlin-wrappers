// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnOrderColumn {
    /**
     * Returns the index of the column in the order of the visible columns. Optionally pass a `position` parameter to get the index of the column in a sub-section of the table
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-ordering#getindex)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-ordering)
     */
    var getIndex: (position: ColumnOrderPosition?) -> Int

    /**
     * Returns `true` if the column is the first column in the order of the visible columns. Optionally pass a `position` parameter to check if the column is the first in a sub-section of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-ordering#getisfirstcolumn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-ordering)
     */
    var getIsFirstColumn: (position: ColumnOrderPosition?) -> Boolean

    /**
     * Returns `true` if the column is the last column in the order of the visible columns. Optionally pass a `position` parameter to check if the column is the last in a sub-section of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-ordering#getislastcolumn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-ordering)
     */
    var getIsLastColumn: (position: ColumnOrderPosition?) -> Boolean
}
