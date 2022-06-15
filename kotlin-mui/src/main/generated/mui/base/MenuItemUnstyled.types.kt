// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface MenuItemUnstyledProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    override var children: react.ReactNode?

    override var className: ClassName?

    var onClick: react.dom.events.MouseEventHandler<org.w3c.dom.HTMLElement>?

    /**
     * If `true`, the menu item will be disabled.
     * @default false
     */
    var disabled: Boolean?

    var component: react.ElementType<*>?

    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

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

external interface MenuItemUnstyledOwnerState {
    var disabled: Boolean

    var focusVisible: Boolean
}
