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

external interface UseTabReturnValue {
    /**
     * If `true`, the tab will be selected.
     */
    var selected: Boolean

    /**
     * If `true`, the tab's focus will be visible.
     */
    var focusVisible: Boolean

    /**
     * Callback for setting the `focusVisible` param.
     */
    var setFocusVisible: react.StateSetter<Boolean>

    /**
     * If `true`, the component will be disabled.
     * @default false
     */
    var disabled: Boolean

    /**
     * If `true`, the component will be active.
     * @default false
     */
    var active: Boolean

    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <TOther extends Record<string, any> = {}>(externalProps?: TOther) => UseTabRootSlotProps<TOther> */
}
