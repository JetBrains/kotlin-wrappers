// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface TabsUnstyledProps :
    TabsUnstyledOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface TabsUnstyledOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

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
    var orientation: dynamic

    /**
     * The direction of the text.
     * @default 'ltr'
     */
    var direction: mui.system.Direction?

    override var className: ClassName?

    /**
     * Callback invoked when new value is being set.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, value: dynamic) -> Unit)?

    /**
     * If `true` the selected tab changes on focus. Otherwise it only
     * changes on activation.
     */
    var selectionFollowsFocus: Boolean?

    /**
     * The props used for each slot inside the Tabs.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', TabsUnstyledRootSlotPropsOverrides, TabsUnstyledOwnerState> */
    }

    /**
     * The components used for each slot inside the Tabs.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: TabsUnstyledSlots?
}

external interface TabsUnstyledSlots {
    /**
     * The component used to render the root.
     * @default 'div'
     */
    var root: react.ElementType<*>?
}
