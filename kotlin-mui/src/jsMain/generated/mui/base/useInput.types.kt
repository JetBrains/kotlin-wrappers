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

    var onBlur: react.dom.events.FocusEventHandler<*>?

    var onClick: react.dom.events.MouseEventHandler<*>?

    var onChange: react.dom.events.ChangeEventHandler<web.html.HTMLInputElement>?

    var onFocus: react.dom.events.FocusEventHandler<*>?

    var inputRef: react.Ref<web.html.HTMLInputElement>?

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

    var onBlur: react.dom.events.FocusEventHandler<*>

    var onChange: react.dom.events.ChangeEventHandler<web.html.HTMLInputElement>

    var onFocus: react.dom.events.FocusEventHandler<*>

    var required: Boolean

    var disabled: Boolean
}

external interface UseInputReturnValue {
    /**
     * If `true`, the component will be disabled.
     * @default false
     */
    var disabled: Boolean

    /**
     * If `true`, the `input` will indicate an error by setting the `aria-invalid` attribute.
     * @default false
     */
    var error: Boolean

    /**
     * If `true`, the `input` will be focused.
     * @default false
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
    var getInputProps: react.Props /* <TOther extends Record<string, any> = {}>(externalProps?: TOther) => UseInputInputSlotProps<TOther> */

    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <TOther extends Record<string, any> = {}>(externalProps?: TOther) => UseInputRootSlotProps<TOther> */

    var inputRef: react.RefCallback<web.html.HTMLInputElement>?

    /**
     * If `true`, the `input` will indicate that it's required.
     * @default false
     */
    var required: Boolean

    /**
     * The `value` of the `input` element.
     */
    var value: Any
}
