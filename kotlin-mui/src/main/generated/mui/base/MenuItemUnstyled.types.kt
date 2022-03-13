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

    var components: dynamic

    var componentsProps: dynamic
}

external interface MenuItemOwnerState {
    var disabled: Boolean

    var focusVisible: Boolean
}
