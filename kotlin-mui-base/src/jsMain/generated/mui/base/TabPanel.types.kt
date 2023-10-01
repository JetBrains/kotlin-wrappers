// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface TabPanelProps :
    TabPanelOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface TabPanelOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * The value of the TabPanel. It will be shown when the Tab with the corresponding value is selected.
     * If not provided, it will fall back to the index of the panel.
     * It is recommended to explicitly provide it, as it's required for the tab panel to be rendered on the server.
     */
    var value: dynamic

    /**
     * The components used for each slot inside the TabPanel.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: TabPanelSlots?

    /**
     * The props used for each slot inside the TabPanel.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', TabPanelRootSlotPropsOverrides, TabPanelOwnerState> */
    }
}

external interface TabPanelSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: react.ElementType<*>?
}
