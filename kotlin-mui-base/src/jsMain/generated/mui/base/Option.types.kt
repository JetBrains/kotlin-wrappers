// Automatically generated - do not modify!

package mui.base

import react.*
import web.cssom.ClassName

external interface OptionProps<OptionValue> :
    OptionOwnProps<OptionValue> {
    var component: Any? /* D */
}

external interface OptionOwnProps<OptionValue> :
    PropsWithChildren,
    PropsWithClassName {
    /**
     * The value of the option.
     */
    var value: OptionValue

    override var children: ReactNode?

    /**
     * If `true`, the option will be disabled.
     * @default false
     */
    var disabled: Boolean?

    override var className: ClassName?

    /**
     * The props used for each slot inside the Option.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: Props? /* SlotComponentProps<'li', OptionRootSlotPropsOverrides, OptionOwnerState<OptionValue>> */
    }

    /**
     * The components used for each slot inside the Option.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: OptionSlots?

    /**
     * A text representation of the option's content.
     * Used for keyboard text navigation matching.
     */
    var label: String?
}

external interface OptionSlots {
    /**
     * The component that renders the root.
     * @default 'li'
     */
    var root: ElementType<*>?
}
