// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface OptionGroupUnstyledProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The human-readable description of the group.
     */
    var label: react.ReactNode?

    override var className: ClassName?

    override var children: react.ReactNode?

    /**
     * If `true` all the options in the group will be disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * The component used for the Root slot.
     * Either a string to use a HTML element or a component.
     * This is equivalent to components.Root.
     * If both are provided, the component is used.
     */
    var component: react.ElementType<*>?

    /**
     * The components used for each slot inside the OptionGroupUnstyled.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
        var Label: react.ElementType<*>?
        var List: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* SlotComponentProps<'li', OptionGroupUnstyledComponentsPropsOverrides, OptionGroupUnstyledOwnerState> */
        var label: react.Props? /* SlotComponentProps<'span', OptionGroupUnstyledComponentsPropsOverrides, OptionGroupUnstyledOwnerState> */
        var list: react.Props? /* SlotComponentProps<'ul', OptionGroupUnstyledComponentsPropsOverrides, OptionGroupUnstyledOwnerState> */
    }
}
