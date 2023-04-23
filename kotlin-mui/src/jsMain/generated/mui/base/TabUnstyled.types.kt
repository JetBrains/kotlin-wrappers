// Automatically generated - do not modify!

package mui.base

external interface TabUnstyledProps :
    TabUnstyledOwnProps,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>

external interface TabUnstyledOwnProps :
    ButtonUnstyledOwnProps {
    /**
     * You can provide your own value. Otherwise, we fall back to the child position index.
     */
    var value: dynamic

    /**
     * Callback invoked when new value is being set.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, value: dynamic) -> Unit)?

    /**
     * The components used for each slot inside the Tab.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    override var slots: ButtonUnstyledOwnProps.Slots?

    interface Slots {
        var root: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the Tab.
     * @default {}
     */
    override var slotProps: ButtonUnstyledOwnProps.SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', TabUnstyledComponentsPropsOverrides, TabUnstyledOwnerState> */
    }
}
