// Automatically generated - do not modify!

package mui.base

external interface OptionGroupUnstyledProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The human-readable description of the group.
     */
    var label: react.ReactNode?

    override var className: String?

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
    var components: dynamic

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var componentsProps: dynamic
}
