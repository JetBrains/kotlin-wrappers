// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface ButtonProps :
    ButtonOwnProps,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>

external interface ButtonActions {
    fun focusVisible()
}

external interface ButtonOwnProps :
    UseButtonParameters,
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * A ref for imperative actions. It currently only supports `focusVisible()` action.
     */
    var action: react.Ref<ButtonActions>?

    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * The props used for each slot inside the Button.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'button', ButtonRootSlotPropsOverrides, ButtonOwnerState> */
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
    override var rootElementName: web.html.HtmlTagName<*>?
}

external interface ButtonSlots {
    /**
     * The component that renders the root.
     * @default props.href || props.to ? 'a' : 'button'
     */
    var root: react.ElementType<*>?
}
