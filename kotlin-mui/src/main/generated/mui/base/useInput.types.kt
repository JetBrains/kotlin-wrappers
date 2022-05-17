// Automatically generated - do not modify!

package mui.base

external interface UseInputParameters {
    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: dynamic

    /**
     * If `true`, the component is disabled.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var disabled: Boolean?

    /**
     * If `true`, the `input` will indicate an error.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var error: Boolean?

    var onBlur: react.dom.events.FocusEventHandler<*>?

    var onClick: react.dom.events.MouseEventHandler<*>?

    var onChange: react.dom.events.ChangeEventHandler<org.w3c.dom.HTMLInputElement>?

    var onFocus: react.dom.events.FocusEventHandler<*>?

    var inputRef: react.Ref<org.w3c.dom.HTMLInputElement>?

    /**
     * If `true`, the `input` element is required.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var required: Boolean?

    var value: dynamic
}
