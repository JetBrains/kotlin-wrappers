// Automatically generated - do not modify!

package mui.base

external interface UseButtonParameters {
    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, allows a disabled button to receive focus.
     * @default false
     */
    var focusableWhenDisabled: Boolean?

    var href: String?

    var onFocusVisible: react.dom.events.FocusEventHandler<*>?

    var rootRef: react.Ref<web.dom.Element>?

    var tabIndex: Int?

    var to: String?

    /**
     * Type attribute applied when the `component` is `button`.
     * @default 'button'
     */
    var type: dynamic /* React.ButtonHTMLAttributes<HTMLButtonElement>['type'] */

    /**
     * The HTML element, e.g.'button', 'a' etc
     * @default ''
     */
    var rootElementName: String? /* keyof HTMLElementTagNameMap */
}

external interface UseButtonRootSlotOwnProps : react.Props {
    // var `aria-disabled`: dynamic /* React.AriaAttributes['aria-disabled'] */

    var disabled: Boolean?

    var tabIndex: Int?

    var type: dynamic /* React.ButtonHTMLAttributes<HTMLButtonElement>['type'] */

    var role: react.dom.aria.AriaRole?

    var onBlur: react.dom.events.FocusEventHandler<*>

    var onFocus: react.dom.events.FocusEventHandler<*>

    var onKeyDown: dynamic

    var onKeyUp: dynamic

    var onMouseDown: react.dom.events.MouseEventHandler<*>

    var onMouseLeave: react.dom.events.MouseEventHandler<*>
}

external interface UseButtonReturnValue {
    /**
     * Resolver for the root slot's props.
     * @param externalProps additional props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <ExternalProps extends Record<string, any> = {}>(externalProps?: ExternalProps) => UseButtonRootSlotProps<ExternalProps> */

    /**
     * If `true`, the component is being focused using keyboard.
     */
    var focusVisible: Boolean

    /**
     * Callback for setting the `focusVisible` param.
     */
    var setFocusVisible: react.StateSetter<Boolean>

    /**
     * If `true`, the component is active (pressed).
     */
    var active: Boolean

    /**
     * A ref to the component's root DOM element.
     */
    var rootRef: react.RefCallback<web.dom.Element>?
}
