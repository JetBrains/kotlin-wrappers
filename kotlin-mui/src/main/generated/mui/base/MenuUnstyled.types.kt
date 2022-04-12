// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface MenuUnstyledProps :
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

    var component: react.ElementType<*>?

    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
        var Listbox: react.ElementType<*>?
    }

    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* Partial<React.ComponentPropsWithRef<typeof PopperUnstyled>> & MenuUnstyledComponentsPropsOverrides */
        var listbox: react.Props? /* React.ComponentPropsWithRef<'ul'> & MenuUnstyledComponentsPropsOverrides */
    }

    /**
     * Triggered when focus leaves the menu and the menu should close.
     */
    var onClose: (() -> Unit)?

    /**
     * Controls whether the menu is displayed.
     * @default false
     */
    var open: Boolean?
}

external interface MenuUnstyledActions {
    fun highlightFirstItem()
    fun highlightLastItem()
}

external interface MenuUnstyledOwnerState {
    var open: Boolean
}
