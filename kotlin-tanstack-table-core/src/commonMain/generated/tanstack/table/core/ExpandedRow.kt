// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface ExpandedRow {
    /**
     * Returns whether the row can be expanded.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getcanexpand)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val getCanExpand: () -> Boolean

    /**
     * Returns whether all parent rows of the row are expanded.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getisallparentsexpanded)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val getIsAllParentsExpanded: () -> Boolean

    /**
     * Returns whether the row is expanded.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#getisexpanded)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val getIsExpanded: () -> Boolean

    /**
     * Returns a function that can be used to toggle the expanded state of the row. This function can be used to bind to an event handler to a button.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#gettoggleexpandedhandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val getToggleExpandedHandler: () -> () -> Unit

    /**
     * Toggles the expanded state (or sets it if `expanded` is provided) for the row.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/expanding#toggleexpanded)
     * [Guide](https://tanstack.com/table/v8/docs/guide/expanding)
     */
    val toggleExpanded: (expanded: Boolean?) -> Unit
}
