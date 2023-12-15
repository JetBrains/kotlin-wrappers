// Automatically generated - do not modify!

package mui.base

external interface UseTabsParameters {
    /**
     * The value of the currently selected `Tab`.
     * If you don't want any selected `Tab`, you can set this prop to `false`.
     */
    var value: Any? /* String or Number */

    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: Any? /* String or Number */

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: Orientation?

    /**
     * The direction of the text.
     * @default 'ltr'
     */
    var direction: useTabsDirection?

    /**
     * Callback invoked when new value is being set.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>?, value: Any /* Number | String */?) -> Unit)?

    /**
     * If `true` the selected tab changes on focus. Otherwise it only
     * changes on activation.
     */
    var selectionFollowsFocus: Boolean?
}

external interface UseTabsReturnValue {
    /**
     * Returns the values to be passed to the tabs provider.
     */
    var contextValue: dynamic
}
