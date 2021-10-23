// Automatically generated - do not modify!

@file:JsModule("@mui/material/RadioGroup")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface RadioGroupProps :
    FormGroupProps {
    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: Any?

    /**
     * The name used to reference the value of the control.
     * If you don't provide this prop, it falls back to a randomly generated name.
     */
    var name: String?

    /**
     * Callback fired when a radio button is selected.
     *
     * @param {React.ChangeEvent<HTMLInputElement>} event The event source of the callback.
     * @param {string} value The value of the selected radio button.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: ((event: react.dom.events.ChangeEvent<org.w3c.dom.HTMLInputElement>, value: String) -> Unit)?

    /**
     * Value of the selected radio button. The DOM API casts this to a string.
     */
    var value: Any?
}

/**
 *
 * Demos:
 *
 * - [Radio Buttons](https://mui.com/components/radio-buttons/)
 *
 * API:
 *
 * - [RadioGroup API](https://mui.com/api/radio-group/)
 * - inherits [FormGroup API](https://mui.com/api/form-group/)
 */
@JsName("default")
external val RadioGroup: react.FC<RadioGroupProps>
