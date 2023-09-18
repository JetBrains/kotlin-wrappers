// Automatically generated - do not modify!

package mui.base

external interface UseInputParameters {
    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: Any?

    /**
     * If `true`, the component is disabled.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var disabled: Boolean?

    /**
     * If `true`, the `input` will indicate an error by setting the `aria-invalid` attribute.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var error: Boolean?

    var onBlur: react.dom.events.FocusEventHandler<web.html.HTMLElement>?

    var onClick: react.dom.events.MouseEventHandler<*>?

    var onChange: react.dom.events.ChangeEventHandler<web.html.HTMLElement>?

    var onFocus: react.dom.events.FocusEventHandler<web.html.HTMLElement>?

    var inputRef: react.Ref<web.html.HTMLInputElement /* or web.html.HTMLTextAreaElement*/>?

    /**
     * If `true`, the `input` element is required.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var required: Boolean?

    var value: Any?
}

external interface UseInputRootSlotOwnProps : react.Props {
    var onClick: dynamic
}

external interface UseInputInputSlotOwnProps : react.Props {
    // var `aria-invalid`: dynamic /* React.AriaAttributes['aria-invalid'] */

    var defaultValue: dynamic

    var value: dynamic

    var onBlur: react.dom.events.FocusEventHandler<web.html.HTMLElement>

    var onChange: react.dom.events.ChangeEventHandler<web.html.HTMLElement>

    var onFocus: react.dom.events.FocusEventHandler<web.html.HTMLElement>

    var required: Boolean

    var disabled: Boolean
}

external interface UseInputReturnValue {
    /**
     * If `true`, the component will be disabled.
     */
    var disabled: Boolean

    /**
     * If `true`, the `input` will indicate an error by setting the `aria-invalid` attribute.
     */
    var error: Boolean

    /**
     * If `true`, the `input` will be focused.
     */
    var focused: Boolean

    /**
     * Return value from the `useFormControlContext` hook.
     */
    var formControlContext: Any?

    /**
     * Resolver for the input slot's props.
     * @param externalProps props for the input slot
     * @returns props that should be spread on the input slot
     */
    var getInputProps: react.Props /* <ExternalProps extends Record<string, any> = {}>(externalProps?: ExternalProps) => UseInputInputSlotProps<ExternalProps> */

    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <ExternalProps extends Record<string, any> = {}>(externalProps?: ExternalProps) => UseInputRootSlotProps<ExternalProps> */

    var inputRef: react.RefCallback<web.html.HTMLInputElement /* or web.html.HTMLTextAreaElement*/>?

    /**
     * If `true`, the `input` will indicate that it's required.
     */
    var required: Boolean

    /**
     * The `value` of the `input` element.
     */
    var value: Any
}
