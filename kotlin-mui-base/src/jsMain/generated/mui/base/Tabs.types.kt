// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface TabsProps :
    TabsOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface TabsOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * The value of the currently selected `Tab`.
     * If you don't want any selected `Tab`, you can set this prop to `null`.
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
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>?, value: Any /* Number | String */?) -> Unit)?

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
        var root: react.Props? /* SlotComponentProps<'div', TabsRootSlotPropsOverrides, TabsOwnerState> */
    }

    /**
     * The components used for each slot inside the Tabs.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: TabsSlots?
}

external interface TabsSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: react.ElementType<*>?
}
