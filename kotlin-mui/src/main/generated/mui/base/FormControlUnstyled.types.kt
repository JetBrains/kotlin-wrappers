// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface FormControlUnstyledProps :
    FormControlUnstyledOwnProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>

external interface FormControlUnstyledOwnProps : react.PropsWithClassName {
    /**
     * The content of the component.
     */
    var children: dynamic

    /**
     * Class name applied to the root element.
     */
    override var className: ClassName?

    /**
     * The components used for each slot inside the FormControl.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* SlotComponentProps<'div', FormControlUnstyledComponentsPropsOverrides, FormControlUnstyledOwnerState> */
    }

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

    var onChange: react.dom.events.ChangeEventHandler<NativeFormControlElement>?

    /**
     * If `true`, the label will indicate that the `input` is required.
     * @default false
     */
    var required: Boolean?

    var value: dynamic
}
