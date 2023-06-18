// Automatically generated - do not modify!

@file:JsModule("@mui/material/Popper")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface PopperProps :
    mui.system.PropsWithSx,
    mui.base.PopperProps {
    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: react.ElementType<*>?

    /**
     * The components used for each slot inside the Popper.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the Popper.
     * @default {}
     */
    var componentsProps: mui.base.PopperOwnProps.SlotProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Autocomplete](https://mui.com/material-ui/react-autocomplete/)
 * - [Menu](https://mui.com/material-ui/react-menu/)
 * - [Popper](https://mui.com/material-ui/react-popper/)
 *
 * API:
 *
 * - [Popper API](https://mui.com/material-ui/api/popper/)
 */
@JsName("default")
external val Popper: react.FC<PopperProps>
