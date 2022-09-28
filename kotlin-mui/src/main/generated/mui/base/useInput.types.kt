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

    var onChange: react.dom.events.ChangeEventHandler<dom.html.HTMLInputElement>?

    var onFocus: react.dom.events.FocusEventHandler<*>?

    var inputRef: react.Ref<dom.html.HTMLInputElement>?

    /**
     * If `true`, the `input` element is required.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var required: Boolean?

    var value: dynamic
}

external interface UseInputRootSlotOwnProps : react.Props {
    var onClick: dynamic
}

external interface UseInputInputSlotOwnProps : react.Props {
    // var `aria-invalid`: dynamic /* React.AriaAttributes['aria-invalid'] */

    var defaultValue: dynamic

    var value: dynamic

    var onBlur: react.dom.events.FocusEventHandler<*>

    var onChange: react.dom.events.ChangeEventHandler<dom.html.HTMLInputElement>

    var onFocus: react.dom.events.FocusEventHandler<*>

    var required: Boolean

    var disabled: Boolean
}
