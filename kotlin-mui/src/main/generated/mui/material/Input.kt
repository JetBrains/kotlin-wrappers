// Automatically generated - do not modify!

@file:JsModule("@mui/material/Input")
@file:JsNonModule

package mui.material

external interface InputProps : react.Props {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: InputClasses

    /**
     * If `true`, the `input` will not have an underline.
     */
    var disableUnderline: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}

/**
 *
 * Demos:
 *
 * - [Text Fields](https://mui.com/components/text-fields/)
 *
 * API:
 *
 * - [Input API](https://mui.com/api/input/)
 * - inherits [InputBase API](https://mui.com/api/input-base/)
 */
@JsName("default")
external val Input: react.FC<InputProps>
