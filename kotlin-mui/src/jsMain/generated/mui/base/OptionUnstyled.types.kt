// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface OptionUnstyledProps<TValue> :
    OptionUnstyledOwnProps<TValue> {
    var component: react.ElementType<*>?
}

external interface OptionUnstyledOwnProps<TValue> :
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
     * The components used for each slot inside the OptionUnstyled.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the OptionUnstyled.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* SlotComponentProps<'li', OptionUnstyledComponentsPropsOverrides, OptionUnstyledOwnerState<TValue>> */
    }

    /**
     * A text representation of the option's content.
     * Used for keyboard text navigation matching.
     */
    var label: String?
}
