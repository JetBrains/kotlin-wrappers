// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface MenuUnstyledProps :
    MenuUnstyledOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLUListElement>

external interface MenuUnstyledActions {
    fun highlightFirstItem()
    fun highlightLastItem()
}

external interface MenuUnstyledOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * A ref with imperative actions.
     * It allows to select the first or last menu item.
     */
    var actions: react.Ref<MenuUnstyledActions>?

    /**
     * An HTML element, [virtualElement](https://popper.js.org/docs/v2/virtual-elements/),
     * or a function that returns either.
     * It's used to set the position of the popper.
     */
    var anchorEl: dynamic /* PopperUnstyledProps['anchorEl'] */

    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * Always keep the menu in the DOM.
     * This prop can be useful in SEO situation or when you want to maximize the responsiveness of the Menu.
     *
     * @default false
     */
    var keepMounted: Boolean?

    var listboxId: String?

    /**
     * Triggered when focus leaves the menu and the menu should close.
     */
    var onClose: (() -> Unit)?

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
        var root: react.Props? /* SlotComponentProps<typeof PopperUnstyled, MenuUnstyledRootSlotPropsOverrides, MenuUnstyledOwnerState> */
        var listbox: react.Props? /* SlotComponentProps<'ul', MenuUnstyledListboxSlotPropsOverrides, MenuUnstyledOwnerState> */
    }

    /**
     * The components used for each slot inside the Menu.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: MenuUnstyledSlots?
}

external interface MenuUnstyledSlots {
    /**
     * The component that renders the root.
     * @default PopperUnstyled
     */
    var root: react.ElementType<*>?

    /**
     * The component that renders the listbox.
     * @default 'ul'
     */
    var listbox: react.ElementType<*>?
}

external interface MenuUnstyledOwnerState {
    var open: Boolean
}
