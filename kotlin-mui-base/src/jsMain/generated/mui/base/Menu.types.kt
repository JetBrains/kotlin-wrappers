// Automatically generated - do not modify!

package mui.base

import js.array.ReadonlyArray
import web.cssom.ClassName

external interface MenuProps :
    MenuOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface MenuActions {
    /**
     * Dispatches an action that can cause a change to the menu's internal state.
     */
    fun dispatch(action: Any /* ListAction<string> */)

    /**
     * Resets the highlighted item.
     */
    fun resetHighlight()
}

external interface MenuOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * A ref with imperative actions that can be performed on the menu.
     */
    var actions: react.Ref<MenuActions>?

    /**
     * The element based on which the menu is positioned.
     */
    var anchor: Any? /* PopupProps['anchor'] */

    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * Function called when the items displayed in the menu change.
     */
    var onItemsChange: ((items: ReadonlyArray<String>) -> Unit)?

    /**
     * The props used for each slot inside the Menu.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', MenuRootSlotPropsOverrides & PopupProps, MenuOwnerState> */
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
     * The component that renders the popup element.
     * @default 'div'
     */
    var root: react.ElementType<*>?

    /**
     * The component that renders the listbox.
     * @default 'ul'
     */
    var listbox: react.ElementType<*>?
}
