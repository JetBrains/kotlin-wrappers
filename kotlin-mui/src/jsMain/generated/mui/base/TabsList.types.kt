// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface TabsListProps :
    TabsListOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface TabsListOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * The props used for each slot inside the TabsList.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', TabsListRootSlotPropsOverrides, TabsListOwnerState> */
    }

    /**
     * The components used for each slot inside the TabsList.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: TabsListSlots?
}

external interface TabsListSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: react.ElementType<*>?
}
