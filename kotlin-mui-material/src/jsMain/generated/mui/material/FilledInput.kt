// Automatically generated - do not modify!

@file:JsModule("@mui/material/FilledInput")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC

external interface FilledInputProps :
    StandardProps,
    InputBaseProps,
    PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FilledInputClasses?

    /**
     * If `true`, the label is hidden.
     * This is used to increase density for a `FilledInput`.
     * Be sure to add `aria-label` to the `input` element.
     * @default false
     */
    var hiddenLabel: Boolean?

    /**
     * If `true`, the input will not have an underline.
     * @default false
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
 * - [Text Field](https://v6.mui.com/material-ui/react-text-field/)
 *
 * API:
 *
 * - [FilledInput API](https://v6.mui.com/material-ui/api/filled-input/)
 * - inherits [InputBase API](https://v6.mui.com/material-ui/api/input-base/)
 */
@JsName("default")
external val FilledInput: FC<FilledInputProps>
