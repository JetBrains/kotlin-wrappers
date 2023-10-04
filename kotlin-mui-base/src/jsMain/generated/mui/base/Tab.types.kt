// Automatically generated - do not modify!

package mui.base

external interface TabProps :
    TabOwnProps,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>

external interface TabOwnProps :
    ButtonOwnProps,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement> {
    /**
     * You can provide your own value. Otherwise, it falls back to the child position index.
     */
    override var value: dynamic

    /**
     * Callback invoked when new value is being set.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, value: Any /* Number | String */) -> Unit)?

    /**
     * The props used for each slot inside the Tab.
     * @default {}
     */
    override var slotProps: ButtonOwnProps.SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'button', TabRootSlotPropsOverrides, TabOwnerState> */
    }

    /**
     * The components used for each slot inside the Tab.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    override var slots: ButtonSlots? /* TabSlots? */
}

external interface TabSlots {
    /**
     * The component that renders the root.
     * @default 'button'
     */
    var root: react.ElementType<*>?
}
