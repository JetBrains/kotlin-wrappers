// Automatically generated - do not modify!

package mui.base

external interface ButtonUnstyledProps :
    react.dom.html.ButtonHTMLAttributes<org.w3c.dom.HTMLButtonElement>

external interface ButtonUnstyledActions {
    fun focusVisible()
}

external interface ButtonUnstyledOwnProps :
    UseButtonProps,
    react.PropsWithChildren {
    /**
     * A ref for imperative actions. It currently only supports `focusVisible()` action.
     */
    var action: react.Ref<ButtonUnstyledActions>?

    override var children: react.ReactNode?

    var className: String?

    var componentsProps: dynamic
}
