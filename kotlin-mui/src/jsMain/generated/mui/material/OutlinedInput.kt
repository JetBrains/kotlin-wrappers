// Automatically generated - do not modify!

@file:JsModule("@mui/material/OutlinedInput")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface OutlinedInputProps :
    mui.system.StandardProps,
    InputBaseProps,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: OutlinedInputClasses?

    /**
     * The label of the `input`. It is only used for layout. The actual labelling
     * is handled by `InputLabel`.
     */
    var label: react.ReactNode?

    /**
     * If `true`, the outline is notched to accommodate the label.
     */
    var notched: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Text fields](https://mui.com/material-ui/react-text-field/)
 *
 * API:
 *
 * - [OutlinedInput API](https://mui.com/material-ui/api/outlined-input/)
 * - inherits [InputBase API](https://mui.com/material-ui/api/input-base/)
 */
@JsName("default")
external val OutlinedInput: react.FC<OutlinedInputProps>
