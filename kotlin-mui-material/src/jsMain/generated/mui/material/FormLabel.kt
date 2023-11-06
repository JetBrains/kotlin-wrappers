// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormLabel")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface FormLabelProps :
    react.dom.html.LabelHTMLAttributes<web.html.HTMLLabelElement>,
    mui.types.PropsWithComponent,
    FormLabelOwnProps

external interface FormLabelOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FormLabelClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
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
 * - [Checkbox](https://mui.com/material-ui/react-checkbox/)
 * - [Radio Group](https://mui.com/material-ui/react-radio-button/)
 * - [Switch](https://mui.com/material-ui/react-switch/)
 *
 * API:
 *
 * - [FormLabel API](https://mui.com/material-ui/api/form-label/)
 */
@JsName("default")
external val FormLabel: react.FC<FormLabelProps>
