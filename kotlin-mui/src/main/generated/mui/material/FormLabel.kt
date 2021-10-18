// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormLabel")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface FormLabelProps :
    react.dom.html.LabelHTMLAttributes<org.w3c.dom.HTMLLabelElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FormLabelClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     */
    var color: mui.system.Union? /* 'primary' | 'secondary' | 'error' | 'info' | 'success' | 'warning', FormLabelPropsColorOverrides */

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
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Checkboxes](https://mui.com/components/checkboxes/)
 * - [Radio Buttons](https://mui.com/components/radio-buttons/)
 * - [Switches](https://mui.com/components/switches/)
 *
 * API:
 *
 * - [FormLabel API](https://mui.com/api/form-label/)
 */
@JsName("default")
external val FormLabel: react.FC<FormLabelProps>
