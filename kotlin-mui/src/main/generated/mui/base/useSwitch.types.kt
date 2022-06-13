// Automatically generated - do not modify!

package mui.base

external interface UseSwitchParameters {
    /**
     * If `true`, the component is checked.
     */
    var checked: Boolean?

    /**
     * The default checked state. Use when the component is not controlled.
     */
    var defaultChecked: Boolean?

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean?

    var onBlur: react.dom.events.FocusEventHandler<*>?

    /**
     * Callback fired when the state is changed.
     *
     * @param {React.ChangeEvent<HTMLInputElement>} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     * You can pull out the new checked state by accessing `event.target.checked` (boolean).
     */
    var onChange: react.dom.events.ChangeEventHandler<org.w3c.dom.HTMLInputElement>?

    var onFocus: react.dom.events.FocusEventHandler<*>?

    var onFocusVisible: react.dom.events.FocusEventHandler<*>?

    /**
     * If `true`, the component is read only.
     */
    var readOnly: Boolean?

    /**
     * If `true`, the `input` element is required.
     */
    var required: Boolean?
}
