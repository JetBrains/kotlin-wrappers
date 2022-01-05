// Automatically generated - do not modify!

package mui.base

external interface FormControlUnstyledProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>

external interface FormControlUnstyledOwnProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Class name applied to the root element.
     */
    var className: String?

    /**
     * The components used for each slot inside the FormControl.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    var componentsProps: dynamic

    var defaultValue: dynamic

    /**
     * If `true`, the label, input and helper text should be displayed in a disabled state.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, the label is displayed in an error state.
     * @default false
     */
    var error: Boolean?

    /**
     * Extra properties to be placed on the FormControlContext.
     * @default {}
     */
    var extraContextProperties: Any?

    /**
     * If `true`, the component is displayed in focused state.
     * @default false
     */
    var focused: Boolean?

    var onChange: react.dom.events.ChangeEventHandler<NativeFormControlElement>?

    /**
     * If `true`, the label will indicate that the `input` is required.
     * @default false
     */
    var required: Boolean?

    var value: dynamic
}
