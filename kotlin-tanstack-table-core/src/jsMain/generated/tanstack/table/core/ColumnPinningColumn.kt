// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnPinningColumn {
    /**
     * Returns whether or not the column can be pinned.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-pinning#getcanpin)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-pinning)
     */
    var getCanPin: () -> Boolean

    /**
     * Returns the pinned position of the column. (`'left'`, `'right'` or `false`)
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-pinning#getispinned)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-pinning)
     */
    var getIsPinned: () -> ColumnPinningPosition

    /**
     * Returns the numeric pinned index of the column within a pinned column group.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-pinning#getpinnedindex)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-pinning)
     */
    var getPinnedIndex: () -> Int

    /**
     * Pins a column to the `'left'` or `'right'`, or unpins the column to the center if `false` is passed.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-pinning#pin)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-pinning)
     */
    var pin: (position: ColumnPinningPosition) -> Unit
}
