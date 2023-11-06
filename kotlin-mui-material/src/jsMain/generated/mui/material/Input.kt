// Automatically generated - do not modify!

@file:JsModule("@mui/material/Input")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface InputProps :
    mui.system.StandardProps,
    InputBaseProps,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: InputClasses?

    /**
     * If `true`, the `input` will not have an underline.
     */
    var disableUnderline: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Text Field](https://mui.com/material-ui/react-text-field/)
 *
 * API:
 *
 * - [Input API](https://mui.com/material-ui/api/input/)
 * - inherits [InputBase API](https://mui.com/material-ui/api/input-base/)
 */
@JsName("default")
external val Input: react.FC<InputProps>
