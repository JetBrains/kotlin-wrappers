// Automatically generated - do not modify!

package mui.base

external interface UseMenuButtonParameters {
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

    /**
     * The ref to the root element.
     */
    var rootRef: react.Ref<web.html.HTMLElement>?
}

external interface UseMenuButtonReturnValue {
    /**
     * If `true`, the component is active (pressed).
     */
    var active: Boolean

    /**
     * Resolver for the root slot's props.
     */
    var getRootProps: Any /* (otherHandlers?: EventHandlers) => UseMenuButtonRootSlotProps */

    var open: Boolean

    /**
     * The ref to the root element.
     */
    var rootRef: react.RefCallback<web.dom.Element>?
}
