// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface OptionGroupUnstyledProps :
    OptionGroupUnstyledOwnProps,
    react.dom.html.LiHTMLAttributes<web.html.HTMLLIElement>

external interface OptionGroupUnstyledOwnProps :
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
     * The components used for each slot inside the OptionGroupUnstyled.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: OptionGroupUnstyledSlots?

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'li', OptionGroupUnstyledRootSlotPropsOverrides, OptionGroupUnstyledOwnerState> */
        var label: react.Props? /* SlotComponentProps<'span', OptionGroupUnstyledLabelSlotPropsOverrides, OptionGroupUnstyledOwnerState> */
        var list: react.Props? /* SlotComponentProps<'ul', OptionGroupUnstyledListSlotPropsOverrides, OptionGroupUnstyledOwnerState> */
    }
}

external interface OptionGroupUnstyledSlots {
    /**
     * The component used to render the root.
     * @default 'li'
     */
    var root: react.ElementType<*>?

    /**
     * The component used to render the label.
     * @default 'span'
     */
    var label: react.ElementType<*>?

    /**
     * The component used to render the list.
     * @default 'ul'
     */
    var list: react.ElementType<*>?
}
