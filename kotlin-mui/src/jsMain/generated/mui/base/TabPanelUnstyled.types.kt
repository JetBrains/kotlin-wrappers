// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface TabPanelUnstyledProps :
    TabPanelUnstyledOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface TabPanelUnstyledOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * The value of the TabPanel. It will be shown when the Tab with the corresponding value is selected.
     */
    var value: dynamic

    /**
     * The components used for each slot inside the TabPanel.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the TabPanel.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', TabPanelUnstyledRootSlotPropsOverrides, TabPanelUnstyledOwnerState> */
    }
}
