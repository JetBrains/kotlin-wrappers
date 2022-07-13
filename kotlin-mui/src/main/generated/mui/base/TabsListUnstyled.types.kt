// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface TabsListUnstyledProps :
    TabsListUnstyledOwnProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>

external interface TabsListUnstyledOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * The components used for each slot inside the TabsList.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the TabsList.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* SlotComponentProps<'div', TabsListUnstyledComponentsPropsOverrides, TabsListUnstyledOwnerState> */
    }
}
