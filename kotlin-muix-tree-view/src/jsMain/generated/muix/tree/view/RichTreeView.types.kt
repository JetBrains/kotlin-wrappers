// Automatically generated - do not modify!

package muix.tree.view

import mui.material.styles.Theme
import mui.system.SxProps
import react.ElementType
import react.Props
import react.Ref
import react.dom.html.HTMLAttributes
import web.cssom.ClassName
import web.html.HTMLUListElement

external interface RichTreeViewProps :
    RichTreeViewPropsBase {
    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: RichTreeViewSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: RichTreeViewSlotProps?

    /**
     * The ref object that allows Tree View manipulation. Can be instantiated with `useRichTreeViewApiRef()`.
     */
    var apiRef: Ref<*>?
}

external interface RichTreeViewSlots : TreeViewSlots {
    /**
     * Element rendered at the root.
     * @default RichTreeViewRoot
     */
    var root: ElementType<*>?
}

external interface RichTreeViewSlotProps : Props

external interface RichTreeViewPropsBase : HTMLAttributes<HTMLUListElement> {
    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: RichTreeViewClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>?
}
