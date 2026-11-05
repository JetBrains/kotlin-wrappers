// Automatically generated - do not modify!

package muix.tree.view

import kotlinx.js.JsPlainObject
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLLIElement

external interface TreeItemLoaderProps :
    HTMLAttributes<HTMLLIElement>,
    PropsWithChildren {
    /**
     * The content of the loading row.
     * When not provided, the default skeleton placeholders are rendered.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TreeItemLoaderClasses?

    /**
     * State of the loading row, forwarded by the `itemLoader` slot.
     * The component does not render it.
     */
    var ownerState: TreeItemLoaderOwnerState?
}

@JsPlainObject
external interface TreeItemLoaderOwnerState {
    /**
     * Index of the loading row inside its group.
     */
    val index: Number

    /**
     * Number of loading rows rendered in the group.
     */
    val itemsCount: Number

    /**
     * Depth of the loading rows.
     */
    val itemDepth: Number

    /**
     * Whether each row renders a checkbox placeholder.
     */
    val isCheckboxSelectionEnabled: Boolean
}
