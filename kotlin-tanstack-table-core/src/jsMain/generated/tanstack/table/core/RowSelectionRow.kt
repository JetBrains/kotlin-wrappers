// Automatically generated - do not modify!

package tanstack.table.core

external interface RowSelectionRow {
    /**
     * Returns whether or not the row can multi-select.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getcanmultiselect)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getCanMultiSelect: () -> Boolean

    /**
     * Returns whether or not the row can be selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getcanselect)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getCanSelect: () -> Boolean

    /**
     * Returns whether or not the row can select sub rows automatically when the parent row is selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getcanselectsubrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getCanSelectSubRows: () -> Boolean

    /**
     * Returns whether or not all of the row's sub rows are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getisallsubrowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getIsAllSubRowsSelected: () -> Boolean

    /**
     * Returns whether or not the row is selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getisselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getIsSelected: () -> Boolean

    /**
     * Returns whether or not some of the row's sub rows are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getissomeselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getIsSomeSelected: () -> Boolean

    /**
     * Returns a handler that can be used to toggle the row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#gettoggleselectedhandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getToggleSelectedHandler: () -> (event: Any) -> Unit

    /**
     * Selects/deselects the row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#toggleselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var toggleSelected: (value: Boolean?, opts: ToggleSelectedOptions?) -> Unit

    sealed interface ToggleSelectedOptions {
        var selectChildren: Boolean?
    }
}
