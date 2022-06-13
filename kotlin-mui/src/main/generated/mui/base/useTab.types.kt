// Automatically generated - do not modify!

package mui.base

external interface UseTabParameters {
    /**
     * You can provide your own value. Otherwise, we fall back to the child position index.
     */
    var value: dynamic

    /**
     * Callback invoked when new value is being set.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, value: dynamic) -> Unit)?

    var onClick: react.dom.events.MouseEventHandler<*>?

    var disabled: Boolean?

    var onFocus: react.dom.events.FocusEventHandler<*>?
}
