// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface TabsListUnstyledProps :
    TabsListUnstyledOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface TabsListUnstyledOwnProps :
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
        var root: react.Props? /* SlotComponentProps<'div', TabsListUnstyledComponentsPropsOverrides, TabsListUnstyledOwnerState> */
    }

    /**
     * The components used for each slot inside the TabsList.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: react.ElementType<*>?
    }
}
