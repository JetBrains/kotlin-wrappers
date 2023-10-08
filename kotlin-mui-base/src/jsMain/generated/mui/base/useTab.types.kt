// Automatically generated - do not modify!

package mui.base

external interface UseTabParameters {
    /**
     * The value of the tab.
     * It's used to associate the tab with a tab panel(s) with the same value.
     * If the value is not provided, it falls back to the position index.
     */
    var value: dynamic

    /**
     * If `true`, the tab will be disabled.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, value: Any /* Number | String */) -> Unit)?

    /**
     * Callback fired when the tab is clicked.
     */
    var onClick: react.dom.events.MouseEventHandler<*>?

    /**
     * If `true`, the tab will be disabled.
     */
    var disabled: Boolean?

    /**
     * The id of the tab.
     * If not provided, it will be automatically generated.
     */
    var id: String?

    /**
     * Ref to the root slot's DOM element.
     */
    var rootRef: react.Ref<web.dom.Element>?
}

external interface UseTabReturnValue {
    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <ExternalProps extends Record<string, unknown> = {}>(externalProps?: ExternalProps) => UseTabRootSlotProps<ExternalProps> */

    /**
     * If `true`, the tab is active (as in `:active` pseudo-class; in other words, pressed).
     */
    var active: Boolean

    /**
     * If `true`, the tab has visible focus.
     * This is a workaround for browsers that do not support this feature natively.
     */
    var focusVisible: Boolean

    /**
     * If `true`, the tab is highlighted.
     */
    var highlighted: Boolean

    /**
     * 0-based index of the tab in the list of tabs.
     */
    var index: Number

    /**
     * Ref to the root slot's DOM element.
     */
    var rootRef: react.RefCallback<web.dom.Element>?

    /**
     * If `true`, the tab is selected.
     */
    var selected: Boolean

    /**
     * Sets the focus-visible state of the tab.
     * This is a workaround for browsers that do not support this feature natively.
     */
    var setFocusVisible: react.StateSetter<Boolean>

    /**
     * Total number of tabs in the nearest parent TabsList.
     * This can be used to determine if the tab is the last one to style it accordingly.
     */
    var totalTabsCount: Number
}
