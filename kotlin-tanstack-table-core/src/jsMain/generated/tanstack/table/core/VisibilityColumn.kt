// Automatically generated - do not modify!

package tanstack.table.core

external interface VisibilityColumn {
    /**
     * Returns whether the column can be hidden
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#getcanhide)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    var getCanHide: () -> Boolean

    /**
     * Returns whether the column is visible
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#getisvisible)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    var getIsVisible: () -> Boolean

    /**
     * Returns a function that can be used to toggle the column visibility. This function can be used to bind to an event handler to a checkbox.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#gettogglevisibilityhandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    var getToggleVisibilityHandler: () -> (event: Any) -> Unit

    /**
     * Toggles the visibility of the column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-visibility#togglevisibility)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-visibility)
     */
    var toggleVisibility: (value: Boolean?) -> Unit
}
