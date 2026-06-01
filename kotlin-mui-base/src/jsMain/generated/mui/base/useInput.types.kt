// Automatically generated - do not modify!

package mui.base

import react.Props
import react.Ref
import react.RefCallback
import react.dom.events.ChangeEventHandler
import react.dom.events.FocusEventHandler
import react.dom.events.MouseEventHandler
import web.html.HTMLElement
import web.html.HTMLInputElement

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

    var onBlur: FocusEventHandler<HTMLElement>?

    var onClick: MouseEventHandler<*>?

    var onChange: ChangeEventHandler<HTMLElement, *>?

    var onFocus: FocusEventHandler<HTMLElement>?

    var inputRef: Ref<HTMLInputElement /* or HTMLTextAreaElement*/>?

    /**
     * If `true`, the `input` element is required.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var required: Boolean?

    var value: Any?
}

external interface UseInputRootSlotOwnProps : Props {
    var onClick: Any? /* React.MouseEventHandler | undefined */
}

external interface UseInputInputSlotOwnProps : Props {
    // var `aria-invalid`: Any /* React.AriaAttributes['aria-invalid'] */

    var defaultValue: Any? /* string | number | readonly string[] | undefined */

    var value: Any? /* string | number | readonly string[] | undefined */

    var onBlur: FocusEventHandler<HTMLElement>

    var onChange: ChangeEventHandler<HTMLElement, *>

    var onFocus: FocusEventHandler<HTMLElement>

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
    var getInputProps: Props /* <ExternalProps extends Record<string, any> = {}>(externalProps?: ExternalProps) => UseInputInputSlotProps<ExternalProps> */

    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: Props /* <ExternalProps extends Record<string, any> = {}>(externalProps?: ExternalProps) => UseInputRootSlotProps<ExternalProps> */

    var inputRef: RefCallback<HTMLInputElement /* or HTMLTextAreaElement*/>?

    /**
     * If `true`, the `input` will indicate that it's required.
     */
    var required: Boolean

    /**
     * The `value` of the `input` element.
     */
    var value: Any
}
