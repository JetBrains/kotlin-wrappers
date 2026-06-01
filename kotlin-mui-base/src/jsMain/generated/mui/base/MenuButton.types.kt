// Automatically generated - do not modify!

package mui.base

import react.*
import web.cssom.ClassName

external interface MenuButtonProps :
    PropsWithChildren,
    PropsWithClassName {
    override var children: ReactNode?

    /**
     * Class name applied to the root element.
     */
    override var className: ClassName?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, allows a disabled button to receive focus.
     * @default false
     */
    var focusableWhenDisabled: Boolean?

    /**
     * Label of the button
     */
    var label: String?

    /**
     * The props used for each slot inside the MenuButton.
     * @default {}
     */
    var slots: MenuButtonSlots?

    /**
     * The components used for each slot inside the MenuButton.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: Props? /* SlotComponentProps<'button', MenuButtonRootSlotPropsOverrides, MenuButtonOwnerState> */
    }
}

external interface MenuButtonRootSlotPropsOverrides

external interface MenuButtonSlots {
    /**
     * The component that renders the root.
     * @default 'button'
     */
    var root: ElementType<*>?
}
