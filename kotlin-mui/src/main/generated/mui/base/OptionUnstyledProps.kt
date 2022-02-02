// Automatically generated - do not modify!

package mui.base

external interface OptionUnstyledProps<TValue> : react.PropsWithChildren {
    /**
     * The value of the option.
     */
    var value: TValue

    override var children: react.ReactNode?

    /**
     * If `true`, the option will be disabled.
     * @default false
     */
    var disabled: Boolean?

    var className: String?

    /**
     * The component used for the Root slot.
     * Either a string to use a HTML element or a component.
     * This is equivalent to components.Root.
     * If both are provided, the component is used.
     */
    var component: react.ElementType<*>?

    /**
     * The components used for each slot inside the OptionUnstyled.
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
