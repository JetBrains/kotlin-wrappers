// Automatically generated - do not modify!

@file:JsModule("@mui/material/Popper")

package mui.material

import mui.base.PopperOwnProps
import mui.base.PopperProps
import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import react.ElementType
import react.FC

external interface PopperProps :
    PropsWithSx,
    PopperProps {
    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: ElementType<*>?

    /**
     * The components used for each slot inside the Popper.
     * Either a string to use a HTML element or a component.
     *
     * @deprecated use the `slots` prop instead. This prop will be removed in v7. [How to migrate](/material-ui/migration/migrating-from-deprecated-apis/).
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: ElementType<*>?
    }

    /**
     * The props used for each slot inside the Popper.
     *
     * @deprecated use the `slotProps` prop instead. This prop will be removed in v7. [How to migrate](/material-ui/migration/migrating-from-deprecated-apis/).
     * @default {}
     */
    var componentsProps: PopperOwnProps.SlotProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Autocomplete](https://v6.mui.com/material-ui/react-autocomplete/)
 * - [Menu](https://v6.mui.com/material-ui/react-menu/)
 * - [Popper](https://v6.mui.com/material-ui/react-popper/)
 *
 * API:
 *
 * - [Popper API](https://v6.mui.com/material-ui/api/popper/)
 */
@JsName("default")
external val Popper: FC<PopperProps>
