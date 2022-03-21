// Automatically generated - do not modify!

@file:JsModule("@mui/material/Popper")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface PopperProps :
    mui.base.PopperUnstyledProps,
    mui.system.PropsWithSx {
    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Autocomplete](https://mui.com/components/autocomplete/)
 * - [Menus](https://mui.com/components/menus/)
 * - [Popper](https://mui.com/components/popper/)
 *
 * API:
 *
 * - [Popper API](https://mui.com/api/popper/)
 */
@JsName("default")
external val Popper: react.FC<PopperProps>
