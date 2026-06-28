// Automatically generated - do not modify!

package muix.tree.view

import mui.material.styles.Theme
import mui.system.SxProps
import react.ComponentType
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
     * The ref object that allows Tree View manipulation. Can be instantiated with `useTreeViewApiRef()`.
     */
    var apiRef: Ref<*>?

    /**
     * Unstable features, breaking changes might be introduced.
     * For each feature, if the flag is not explicitly set to `true`,
     * the feature will be fully disabled and any property / method call will not have any effect.
     */
    var experimentalFeatures: Any? /* TreeViewExperimentalFeatures<RichTreeViewPluginSignatures> */
}

external interface RichTreeViewSlots {
    /**
     * Element rendered at the root.
     * @default RichTreeViewRoot
     */
    var root: ElementType<*>?

    /**
     * Custom component for the item.
     * @default TreeItem.
     */
    var item: ComponentType<TreeItemProps>?
}

external interface RichTreeViewSlotProps : Props {
    var root: Props?

    var item: Props?
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
}
