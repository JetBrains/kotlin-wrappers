// Automatically generated - do not modify!

package mui.base

external interface ButtonUnstyledProps :
    react.dom.html.ButtonHTMLAttributes<org.w3c.dom.HTMLButtonElement>

external interface ButtonUnstyledActions {
    fun focusVisible()
}

external interface ButtonUnstyledOwnProps :
    UseButtonParameters,
    react.PropsWithChildren {
    /**
     * A ref for imperative actions. It currently only supports `focusVisible()` action.
     */
    var action: react.Ref<ButtonUnstyledActions>?

    override var children: react.ReactNode?

    var className: String?

    /**
     * The components used for each slot inside the Button.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the Button.
     * @default {}
     */
    var componentsProps: dynamic
}
