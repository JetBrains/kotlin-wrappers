// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface MenuProps :
    MenuOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLUListElement>

external interface MenuActions {
    fun dispatch(action: Any /* ListAction<string> */)
}

external interface MenuOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * A ref with imperative actions.
     * It allows to select the first or last menu item.
     */
    var actions: react.Ref<MenuActions>?

    /**
     * An HTML element, [virtualElement](https://popper.js.org/docs/v2/virtual-elements/),
     * or a function that returns either.
     * It's used to set the position of the popper.
     */
    var anchorEl: dynamic /* PopperProps['anchorEl'] */

    override var children: react.ReactNode?

    override var className: ClassName?

    var defaultOpen: Boolean?

    var listboxId: String?

    /**
     * Triggered when focus leaves the menu and the menu should close.
     */
    var onOpenChange: ((open: Boolean) -> Unit)?

    /**
     * Controls whether the menu is displayed.
     * @default false
     */
    var open: Boolean?

    /**
     * The props used for each slot inside the Menu.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<typeof Popper, MenuRootSlotPropsOverrides, MenuOwnerState> */
        var listbox: react.Props? /* SlotComponentProps<'ul', MenuListboxSlotPropsOverrides, MenuOwnerState> */
    }

    /**
     * The components used for each slot inside the Menu.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: MenuSlots?
}

external interface MenuSlots {
    /**
     * The component that renders the root.
     * @default Popper
     */
    var root: react.ElementType<*>?

    /**
     * The component that renders the listbox.
     * @default 'ul'
     */
    var listbox: react.ElementType<*>?
}

external interface MenuOwnerState {
    var open: Boolean
}
