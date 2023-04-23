// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormControlLabel")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface FormControlLabelProps :
    mui.system.StandardProps,
    react.dom.html.LabelHTMLAttributes<web.html.HTMLLabelElement>,
    mui.system.PropsWithSx {
    /**
     * If `true`, the component appears selected.
     */
    var checked: Boolean?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FormControlLabelClasses?

    /**
     * The props used for each slot inside.
     * @default {}
     */
    var componentsProps: dynamic
    var typography: dynamic

    /**
     * A control element. For instance, it can be a `Radio`, a `Switch` or a `Checkbox`.
     */
    var control: react.ReactElement<*>

    /**
     * If `true`, the control is disabled.
     */
    var disabled: Boolean?

    /**
     * If `true`, the label is rendered as it is passed without an additional typography node.
     */
    var disableTypography: Boolean?

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: react.Ref<*>?

    /**
     * A text or an element to be used in an enclosing label element.
     */
    var label: react.ReactNode

    /**
     * The position of the label.
     * @default 'end'
     */
    var labelPlacement: LabelPlacement?

    var name: String?

    /**
     * Callback fired when the state is changed.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * You can pull out the new checked state by accessing `event.target.checked` (boolean).
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, checked: Boolean) -> Unit)?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The value of the component.
     */
    var value: dynamic
}

/**
 * Drop-in replacement of the `Radio`, `Switch` and `Checkbox` component.
 * Use this component if you want to display an extra label.
 *
 * Demos:
 *
 * - [Checkbox](https://mui.com/material-ui/react-checkbox/)
 * - [Radio Group](https://mui.com/material-ui/react-radio-button/)
 * - [Switch](https://mui.com/material-ui/react-switch/)
 *
 * API:
 *
 * - [FormControlLabel API](https://mui.com/material-ui/api/form-control-label/)
 */
@JsName("default")
external val FormControlLabel: react.FC<FormControlLabelProps>
