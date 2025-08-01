// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface RowSelectionRow {
    /**
     * Returns whether or not the row can multi-select.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getcanmultiselect)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getCanMultiSelect: () -> Boolean

    /**
     * Returns whether or not the row can be selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getcanselect)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getCanSelect: () -> Boolean

    /**
     * Returns whether or not the row can select sub rows automatically when the parent row is selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getcanselectsubrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getCanSelectSubRows: () -> Boolean

    /**
     * Returns whether or not all of the row's sub rows are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getisallsubrowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getIsAllSubRowsSelected: () -> Boolean

    /**
     * Returns whether or not the row is selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getisselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getIsSelected: () -> Boolean

    /**
     * Returns whether or not some of the row's sub rows are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getissomeselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getIsSomeSelected: () -> Boolean

    /**
     * Returns a handler that can be used to toggle the row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#gettoggleselectedhandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getToggleSelectedHandler: () -> (event: Any) -> Unit

    /**
     * Selects/deselects the row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#toggleselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val toggleSelected: (value: Boolean?, opts: ToggleSelectedOptions?) -> Unit

    @JsPlainObject
    interface ToggleSelectedOptions {
        val selectChildren: Boolean?
    }
}
