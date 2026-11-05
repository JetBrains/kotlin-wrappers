// Automatically generated - do not modify!

package muix.tree.view

import kotlinx.js.JsPlainObject
import react.ElementType
import react.Props
import react.dom.svg.SVGAttributes
import web.svg.SVGElement

external interface TreeItemIconProps : Props {
    /**
     * The status of the item, used to pick the icon (for example expanded or collapsed).
     */
    var status: UseTreeItemStatus

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

@JsPlainObject
external interface TreeItemIconSlots {
    /**
     * The icon used to collapse the item.
     */
    val collapseIcon: ElementType<*>?

    /**
     * The icon used to expand the item.
     */
    val expandIcon: ElementType<*>?

    /**
     * The icon displayed next to an end item.
     */
    val endIcon: ElementType<*>?

    /**
     * The icon to display next to the Tree Item's label.
     */
    val icon: ElementType<*>?
}

external interface TreeItemIconSlotProps : Props {
    var collapseIcon: SVGAttributes<SVGElement>?

    var expandIcon: SVGAttributes<SVGElement>?

    var endIcon: SVGAttributes<SVGElement>?

    var icon: SVGAttributes<SVGElement>?
}
