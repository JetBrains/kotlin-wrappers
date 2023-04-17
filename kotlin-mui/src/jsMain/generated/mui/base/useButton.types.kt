// Automatically generated - do not modify!

package mui.base

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

    var onMouseUp: react.dom.events.MouseEventHandler<*>
}

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

    var tabIndex: Int?

    var to: String?

    /**
     * Type attribute applied when the `component` is `button`.
     * @default 'button'
     */
    var type: dynamic /* React.ButtonHTMLAttributes<HTMLButtonElement>['type'] */
}
