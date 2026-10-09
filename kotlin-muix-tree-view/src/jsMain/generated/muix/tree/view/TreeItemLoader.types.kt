// Automatically generated - do not modify!

package muix.tree.view

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

external interface TreeItemLoaderOwnerState {
    /**
     * Index of the loading row inside its group.
     */
    var index: Number

    /**
     * Number of loading rows rendered in the group.
     */
    var itemsCount: Number

    /**
     * Depth of the loading rows.
     */
    var itemDepth: Number

    /**
     * Whether each row renders a checkbox placeholder.
     */
    var isCheckboxSelectionEnabled: Boolean
}
