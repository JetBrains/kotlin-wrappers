// Automatically generated - do not modify!

package tanstack.table.core

external interface ExpandedInstance<TData : RowData> {
    /**
     * Returns whether there are any rows that can be expanded.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getcansomerowsexpand)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    var getCanSomeRowsExpand: () -> Boolean

    /**
     * Returns the maximum depth of the expanded rows.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getexpandeddepth)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    var getExpandedDepth: () -> Int

    /**
     * Returns the row model after expansion has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getexpandedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    var getExpandedRowModel: () -> RowModel<TData>

    /**
     * Returns whether all rows are currently expanded.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getisallrowsexpanded)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    var getIsAllRowsExpanded: () -> Boolean

    /**
     * Returns whether there are any rows that are currently expanded.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getissomerowsexpanded)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    var getIsSomeRowsExpanded: () -> Boolean

    /**
     * Returns the row model before expansion has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getpreexpandedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    var getPreExpandedRowModel: () -> RowModel<TData>

    /**
     * Returns a handler that can be used to toggle the expanded state of all rows. This handler is meant to be used with an `input[type=checkbox]` element.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#gettoggleallrowsexpandedhandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    var getToggleAllRowsExpandedHandler: () -> (event: Any) -> Unit

    /**
     * Resets the expanded state of the table to the initial state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#resetexpanded)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    var resetExpanded: (defaultState: Boolean?) -> Unit

    /**
     * Updates the expanded state of the table via an update function or value.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#setexpanded)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    var setExpanded: (updater: Updater<ExpandedState>) -> Unit

    /**
     * Toggles the expanded state for all rows.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#toggleallrowsexpanded)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    var toggleAllRowsExpanded: (expanded: Boolean?) -> Unit
}
