// Automatically generated - do not modify!

package mui.base

external interface UseTabsParameters {
    /**
     * The value of the currently selected `Tab`.
     * If you don't want any selected `Tab`, you can set this prop to `false`.
     */
    var value: Any? /* String or Number or Boolean? /* false */ */

    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: Any? /* String or Number or Boolean? /* false */ */

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: mui.material.Orientation?

    /**
     * The direction of the text.
     * @default 'ltr'
     */
    var direction: useTabsDirection?

    /**
     * Callback invoked when new value is being set.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, value: dynamic) -> Unit)?

    /**
     * If `true` the selected tab changes on focus. Otherwise it only
     * changes on activation.
     */
    var selectionFollowsFocus: Boolean?
}

external interface UseTabsReturnValue {
    /**
     * Returns the values to be passed to the tabs context provider.
     */
    var tabsContextValue: Any /* TabsContextValue */
}
