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

    /**
     * Component rendered instead of the default loading rows.
     * It renders inside the tree root while the tree is loading, which keeps the
     * `role="tree"` and `aria-busy` attributes, and inside a lazily loading item
     * while its children load.
     * Compose it with `TreeItemLoader` to keep the rows semantically correct.
     */
    var loading: ElementType<*>?

    /**
     * Component rendered for each loading row.
     * It also renders for the children of an item while they load lazily.
     * Wrap custom content in `TreeItemLoader` to keep the row semantically correct.
     * @default TreeItemLoader
     */
    var itemLoader: ElementType<*>?
}

external interface RichTreeViewSlotProps :
    TreeViewSlotProps {
    var loading: Props?

    var itemLoader: Props?
}

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

    /**
     * If `true`, a loading UI is displayed instead of the tree items.
     * @default false
     */
    var loading: Boolean?
}
