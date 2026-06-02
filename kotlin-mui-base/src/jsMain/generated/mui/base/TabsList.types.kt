// Automatically generated - do not modify!

package mui.base

import react.*
import react.dom.html.HTMLAttributes
import web.cssom.ClassName
import web.html.HTMLDivElement

external interface TabsListProps :
    TabsListOwnProps,
    HTMLAttributes<HTMLDivElement>

external interface TabsListOwnProps :
    PropsWithChildren,
    PropsWithClassName {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    override var className: ClassName?

    /**
     * The props used for each slot inside the TabsList.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: Props? /* SlotComponentProps<'div', TabsListRootSlotPropsOverrides, TabsListOwnerState> */
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
    var root: ElementType<*>?
}
