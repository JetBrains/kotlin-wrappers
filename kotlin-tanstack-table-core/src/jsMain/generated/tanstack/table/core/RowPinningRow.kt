// Automatically generated - do not modify!

package tanstack.table.core

external interface RowPinningRow {
    /**
     * Returns whether or not the row can be pinned.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#getcanpin-1)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var getCanPin: () -> Boolean

    /**
     * Returns the pinned position of the row. (`'top'`, `'bottom'` or `false`)
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#getispinned-1)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var getIsPinned: () -> RowPinningPosition

    /**
     * Returns the numeric pinned index of the row within a pinned row group.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#getpinnedindex-1)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var getPinnedIndex: () -> Int

    /**
     * Pins a row to the `'top'` or `'bottom'`, or unpins the row to the center if `false` is passed.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pinning#pin-1)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pinning)
     */
    var pin: (position: RowPinningPosition, includeLeafRows: Boolean?, includeParentRows: Boolean?) -> Unit
}
