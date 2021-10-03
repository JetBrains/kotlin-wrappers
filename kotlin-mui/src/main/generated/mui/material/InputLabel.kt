// Automatically generated - do not modify!

@file:JsModule("@mui/material/InputLabel")
@file:JsNonModule

package mui.material

external interface InputLabelProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: InputLabelClasses

    var color: dynamic /* FormLabelProps['color'] */

    /**
     * If `true`, the transition animation is disabled.
     * @default false
     */
    var disableAnimation: Boolean

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean

    /**
     * If `true`, the label is displayed in an error state.
     */
    var error: Boolean

    /**
     * If `true`, the `input` of this label is focused.
     */
    var focused: Boolean

    /**
     * If `dense`, will adjust vertical spacing. This is normally obtained via context from
     * FormControl.
     */
    var margin: Union /* 'dense' */

    /**
     * if `true`, the label will indicate that the `input` is required.
     */
    var required: Boolean

    /**
     * If `true`, the label is shrunk.
     */
    var shrink: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * The variant to use.
     */
    var variant: Union /* 'standard' | 'outlined' | 'filled' */
}

/**
 *
 * Demos:
 *
 * - [Text Fields](https://mui.com/components/text-fields/)
 *
 * API:
 *
 * - [InputLabel API](https://mui.com/api/input-label/)
 * - inherits [FormLabel API](https://mui.com/api/form-label/)
 */
@JsName("default")
external val InputLabel: react.FC<InputLabelProps>
