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
    var onChange: react.dom.events.ChangeEventHandler<web.html.HTMLInputElement>?

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

external interface UseSwitchReturnValue {
    /**
     * If `true`, the component will be checked.
     */
    var checked: Boolean

    /**
     * If `true`, the component will be disabled.
     */
    var disabled: Boolean

    /**
     * If `true`, it indicates that the component is being focused using keyboard.
     */
    var focusVisible: Boolean

    /**
     * Resolver for the input slot's props.
     * @param externalProps props for the input slot
     * @returns props that should be spread on the input slot
     */
    var getInputProps: (externalProps: react.dom.html.HTMLAttributes<web.html.HTMLInputElement>?) -> Any /* UseSwitchInputSlotProps */

    /**
     * Ref to the input slot's DOM node.
     */
    var inputRef: react.RefCallback<web.html.HTMLInputElement>?

    /**
     * If `true`, the component will be read only.
     */
    var readOnly: Boolean
}
