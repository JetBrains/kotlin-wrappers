// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface OptionUnstyledProps<TValue> :
    react.PropsWithChildren,
    react.PropsWithClassName {
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

    override var className: ClassName?

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

    /**
     * A text representation of the option's content.
     * Used for keyboard text navigation matching.
     */
    var label: String?
}
