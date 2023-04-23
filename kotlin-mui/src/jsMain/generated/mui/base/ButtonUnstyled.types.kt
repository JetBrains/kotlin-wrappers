// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface ButtonUnstyledProps :
    ButtonUnstyledOwnProps,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>

external interface ButtonUnstyledActions {
    fun focusVisible()
}

external interface ButtonUnstyledOwnProps :
    UseButtonParameters,
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * A ref for imperative actions. It currently only supports `focusVisible()` action.
     */
    var action: react.Ref<ButtonUnstyledActions>?

    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * The props used for each slot inside the Button.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'button', ButtonUnstyledComponentsPropsOverrides, ButtonUnstyledOwnerState> */
    }

    /**
     * The components used for each slot inside the Button.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: react.ElementType<*>?
    }
}
