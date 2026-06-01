// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormLabel")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.LabelHTMLAttributes
import web.html.HTMLLabelElement

external interface FormLabelProps :
    LabelHTMLAttributes<HTMLLabelElement>,
    PropsWithComponent,
    FormLabelOwnProps

external interface FormLabelPropsColorOverrides

external interface FormLabelOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FormLabelClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     */
    var color: FormLabelColor?

    /**
     * If `true`, the label should be displayed in a disabled state.
     */
    var disabled: Boolean?

    /**
     * If `true`, the label is displayed in an error state.
     */
    var error: Boolean?

    /**
     * If `true`, the label should use filled classes key.
     */
    var filled: Boolean?

    /**
     * If `true`, the input of this label is focused (used by `FormGroup` components).
     */
    var focused: Boolean?

    /**
     * If `true`, the label will indicate that the `input` is required.
     */
    var required: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Checkbox](https://v6.mui.com/material-ui/react-checkbox/)
 * - [Radio Group](https://v6.mui.com/material-ui/react-radio-button/)
 * - [Switch](https://v6.mui.com/material-ui/react-switch/)
 *
 * API:
 *
 * - [FormLabel API](https://v6.mui.com/material-ui/api/form-label/)
 */
@JsName("default")
external val FormLabel: FC<FormLabelProps>
