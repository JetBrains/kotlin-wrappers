// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnSizingHeader {
    /**
     * Returns an event handler function that can be used to resize the header. It can be used as an:
     * - `onMouseDown` handler
     * - `onTouchStart` handler
     *
     * The dragging and release events are automatically handled for you.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#getresizehandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    var getResizeHandler: () -> (event: Any) -> Unit

    /**
     * Returns the current size of the header.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#getsize)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    var getSize: () -> Int

    /**
     * Returns the offset measurement along the row-axis (usually the x-axis for standard tables) for the header. This is effectively a sum of the offset measurements of all preceding headers.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-sizing#getstart)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-sizing)
     */
    var getStart: (position: ColumnPinningPosition?) -> Int
}
