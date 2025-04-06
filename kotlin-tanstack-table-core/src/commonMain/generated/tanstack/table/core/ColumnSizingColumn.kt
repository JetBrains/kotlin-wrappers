// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface ColumnSizingColumn {
    /**
     * Returns `true` if the column can be resized.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#getcanresize)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val getCanResize: () -> Boolean

    /**
     * Returns `true` if the column is currently being resized.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#getisresizing)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val getIsResizing: () -> Boolean

    /**
     * Returns the current size of the column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#getsize)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val getSize: () -> Int

    /**
     * Returns the offset measurement along the row-axis (usually the x-axis for standard tables) for the header. This is effectively a sum of the offset measurements of all preceding (left) headers in relation to the current column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#getstart)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val getStart: (position: ColumnOrderPosition?) -> Int

    /**
     * Returns the offset measurement along the row-axis (usually the x-axis for standard tables) for the header. This is effectively a sum of the offset measurements of all succeeding (right) headers in relation to the current column.
     */
    val getAfter: (position: ColumnOrderPosition?) -> Int

    /**
     * Resets the column to its initial size.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#resetsize)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    val resetSize: () -> Unit
}
