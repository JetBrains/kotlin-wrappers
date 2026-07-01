// Automatically generated - do not modify!

package muix.tree.view

import react.ElementType
import react.Props

external interface TreeItemIconProps : Props {
    var status: Any? /* UseTreeItemStatus */

    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: TreeItemIconSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: TreeItemIconSlotProps?
}

external interface TreeItemIconSlots {
    /**
     * The icon used to collapse the item.
     */
    var collapseIcon: ElementType<*>?

    /**
     * The icon used to expand the item.
     */
    var expandIcon: ElementType<*>?

    /**
     * The icon displayed next to an end item.
     */
    var endIcon: ElementType<*>?

    /**
     * The icon to display next to the Tree Item's label.
     */
    var icon: ElementType<*>?
}

external interface TreeItemIconSlotProps : Props {
    var collapseIcon: Props?

    var expandIcon: Props?

    var endIcon: Props?

    var icon: Props?
}
