// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface OptionGroupProps :
    OptionGroupOwnProps,
    react.dom.html.LiHTMLAttributes<web.html.HTMLLIElement>

external interface OptionGroupOwnProps :
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
        var root: react.Props? /* SlotComponentProps<'li', OptionGroupRootSlotPropsOverrides, OptionGroupOwnerState> */
        var label: react.Props? /* SlotComponentProps<'span', OptionGroupLabelSlotPropsOverrides, OptionGroupOwnerState> */
        var list: react.Props? /* SlotComponentProps<'ul', OptionGroupListSlotPropsOverrides, OptionGroupOwnerState> */
    }
}

external interface OptionGroupSlots {
    /**
     * The component that renders the root.
     * @default 'li'
     */
    var root: react.ElementType<*>?

    /**
     * The component that renders the label.
     * @default 'span'
     */
    var label: react.ElementType<*>?

    /**
     * The component that renders the list.
     * @default 'ul'
     */
    var list: react.ElementType<*>?
}
