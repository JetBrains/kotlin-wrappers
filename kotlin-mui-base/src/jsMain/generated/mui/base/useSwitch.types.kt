// Automatically generated - do not modify!

package mui.base

import react.RefCallback
import react.dom.events.ChangeEventHandler
import react.dom.events.FocusEventHandler
import react.dom.html.HTMLAttributes
import web.html.HTMLInputElement

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

    var onBlur: FocusEventHandler<*>?

    /**
     * Callback fired when the state is changed.
     *
     * @param {React.ChangeEvent<HTMLInputElement>} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     * You can pull out the new checked state by accessing `event.target.checked` (boolean).
     */
    var onChange: ChangeEventHandler<HTMLInputElement, *>?

    var onFocus: FocusEventHandler<*>?

    var onFocusVisible: FocusEventHandler<*>?

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
    var getInputProps: (externalProps: HTMLAttributes<HTMLInputElement>?) -> Any /* UseSwitchInputSlotProps */

    /**
     * Ref to the input slot's DOM node.
     */
    var inputRef: RefCallback<HTMLInputElement>?

    /**
     * If `true`, the component will be read only.
     */
    var readOnly: Boolean
}
