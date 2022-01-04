// Automatically generated - do not modify!

package mui.base

external interface UseButtonProps : react.Props {
    /**
     * The component used for the Root slot.
     * Either a string to use a HTML element or a component.
     * This is equivalent to `components.Root`. If both are provided, the `component` is used.
     * @default 'button'
     */
    var component: react.ElementType<*>?

    /**
     * The components used for each slot inside the Button.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    var href: String?

    var onClick: react.dom.events.MouseEventHandler<*>?

    var onFocusVisible: react.dom.events.FocusEventHandler<*>?

    var tabIndex: Int?

    var to: String?

    /**
     * Type attribute applied when the `component` is `button`.
     * @default 'button'
     */
    var type: dynamic /* React.ButtonHTMLAttributes<HTMLButtonElement>['type'] */
}
