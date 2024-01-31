// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface MenuItemProps :
    MenuItemOwnProps,
    react.dom.html.LiHTMLAttributes<web.html.HTMLLIElement>

external interface MenuItemOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName,
    react.dom.html.LiHTMLAttributes<web.html.HTMLLIElement> {
    override var children: react.ReactNode?

    override var className: ClassName?

    override var onClick: react.dom.events.MouseEventHandler<web.html.HTMLLIElement>?

    /**
     * If `true`, the menu item will be disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * The components used for each slot inside the MenuItem.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: MenuItemSlots?

    /**
     * The props used for each slot inside the MenuItem.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'li', MenuItemRootSlotPropsOverrides, MenuItemOwnerState> */
    }

    /**
     * A text representation of the menu item's content.
     * Used for keyboard text navigation matching.
     */
    var label: String?

    /**
     * If `true`, the menu item won't receive focus when the mouse moves over it.
     *
     * @default false
     */
    var disableFocusOnHover: Boolean?
}

external interface MenuItemSlots {
    /**
     * The component that renders the root.
     * @default 'li'
     */
    var root: react.ElementType<*>?
}

external interface MenuItemState {
    var disabled: Boolean

    var highlighted: Boolean
}
