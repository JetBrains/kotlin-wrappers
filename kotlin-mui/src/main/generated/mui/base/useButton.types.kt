// Automatically generated - do not modify!

package mui.base

external interface UseButtonParameters {
    /**
     * The component used for the Root slot.
     * Either a string to use a HTML element or a component.
     * @default 'button'
     */
    var component: react.ElementType<*>?

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

    var tabIndex: Int?

    var to: String?

    /**
     * Type attribute applied when the `component` is `button`.
     * @default 'button'
     */
    var type: dynamic /* React.ButtonHTMLAttributes<HTMLButtonElement>['type'] */
}
