// Automatically generated - do not modify!

package muix.tree.view

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface SimpleTreeViewProps :
    react.PropsWithChildren,
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Overridable component slots.
     */
    var slots: SimpleTreeViewSlots?

    /**
     * The props used for each component slot.
     */
    var slotProps: SimpleTreeViewSlotProps?

    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SimpleTreeViewClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The ref object that allows Tree View manipulation. Can be instantiated with `useTreeViewApiRef()`.
     */
    var apiRef: react.Ref<*>?

    /**
     * Unstable features, breaking changes might be introduced.
     * For each feature, if the flag is not explicitly set to `true`,
     * the feature will be fully disabled and any property / method call will not have any effect.
     */
    var experimentalFeatures: Any? /* TreeViewExperimentalFeatures<SimpleTreeViewPlugins> */
}

external interface SimpleTreeViewSlots {
    /**
     * Element rendered at the root.
     * @default SimpleTreeViewRoot
     */
    var root: react.ElementType<*>?
}

external interface SimpleTreeViewSlotProps : react.Props {
    var root: react.Props?
}
