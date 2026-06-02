// Automatically generated - do not modify!

package mui.base

import react.*
import react.dom.html.ButtonHTMLAttributes
import web.cssom.ClassName
import web.dom.TagName
import web.html.HTMLButtonElement
import web.html.HTMLElement

external interface ButtonProps :
    ButtonOwnProps,
    ButtonHTMLAttributes<HTMLButtonElement>

external interface ButtonActions {
    fun focusVisible()
}

external interface ButtonOwnProps :
    UseButtonParameters,
    PropsWithChildren,
    PropsWithClassName {
    /**
     * A ref for imperative actions. It currently only supports `focusVisible()` action.
     */
    var action: Ref<ButtonActions>?

    override var children: ReactNode?

    override var className: ClassName?

    /**
     * The props used for each slot inside the Button.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: Props? /* SlotComponentProps<'button', ButtonRootSlotPropsOverrides, ButtonOwnerState> */
    }

    /**
     * The components used for each slot inside the Button.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: ButtonSlots?

    /**
     * The HTML element that is ultimately rendered, for example 'button' or 'a'
     * @default 'button'
     */
    override var rootElementName: TagName<out HTMLElement>?
}

external interface ButtonSlots {
    /**
     * The component that renders the root.
     * @default props.href || props.to ? 'a' : 'button'
     */
    var root: ElementType<*>?
}
