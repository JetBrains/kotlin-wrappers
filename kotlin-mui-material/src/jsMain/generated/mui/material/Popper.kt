// Automatically generated - do not modify!

@file:JsModule("@mui/material/Popper")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import react.ElementType
import react.FC

external interface PopperProps :
    PropsWithSx,
    mui.base.PopperProps {
    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: ElementType<*>?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Autocomplete](https://v7.mui.com/material-ui/react-autocomplete/)
 * - [Menu](https://v7.mui.com/material-ui/react-menu/)
 * - [Popper](https://v7.mui.com/material-ui/react-popper/)
 *
 * API:
 *
 * - [Popper API](https://v7.mui.com/material-ui/api/popper/)
 */
@JsName("default")
external val Popper: FC<PopperProps>
