// Automatically generated - do not modify!

package mui.base

import react.*
import react.dom.html.LiHTMLAttributes
import web.cssom.ClassName
import web.html.HTMLLIElement

external interface OptionGroupProps :
    OptionGroupOwnProps,
    LiHTMLAttributes<HTMLLIElement>

external interface OptionGroupRootSlotPropsOverrides

external interface OptionGroupLabelSlotPropsOverrides

external interface OptionGroupListSlotPropsOverrides

external interface OptionGroupOwnProps :
    PropsWithChildren,
    PropsWithClassName {
    /**
     * The human-readable description of the group.
     */
    var label: ReactNode?

    override var className: ClassName?

    override var children: ReactNode?

    /**
     * If `true` all the options in the group will be disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * The components used for each slot inside the OptionGroup.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: OptionGroupSlots?

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: Props? /* SlotComponentProps<'li', OptionGroupRootSlotPropsOverrides, OptionGroupOwnerState> */
        var label: Props? /* SlotComponentProps<'span', OptionGroupLabelSlotPropsOverrides, OptionGroupOwnerState> */
        var list: Props? /* SlotComponentProps<'ul', OptionGroupListSlotPropsOverrides, OptionGroupOwnerState> */
    }
}

external interface OptionGroupSlots {
    /**
     * The component that renders the root.
     * @default 'li'
     */
    var root: ElementType<*>?

    /**
     * The component that renders the label.
     * @default 'span'
     */
    var label: ElementType<*>?

    /**
     * The component that renders the list.
     * @default 'ul'
     */
    var list: ElementType<*>?
}
