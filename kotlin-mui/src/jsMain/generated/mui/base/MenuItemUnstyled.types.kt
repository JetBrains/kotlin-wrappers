// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface MenuItemUnstyledProps :
    MenuItemUnstyledOwnProps,
    react.dom.html.LiHTMLAttributes<web.html.HTMLLIElement>

external interface MenuItemUnstyledOwnerState {
    var disabled: Boolean

    var focusVisible: Boolean
}

external interface MenuItemUnstyledOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    override var children: react.ReactNode?

    override var className: ClassName?

    var onClick: react.dom.events.MouseEventHandler<web.html.HTMLLIElement>?

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
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the MenuItem.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* SlotComponentProps<'li', MenuItemUnstyledComponentsPropsOverrides, MenuItemUnstyledOwnerState> */
    }

    /**
     * A text representation of the menu item's content.
     * Used for keyboard text navigation matching.
     */
    var label: String?
}
