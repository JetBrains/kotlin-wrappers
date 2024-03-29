// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface FormControlProps :
    FormControlOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface FormControlOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Class name applied to the root element.
     */
    override var className: ClassName?

    var defaultValue: Any?

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
     * Callback fired when the form element's value is modified.
     */
    var onChange: react.dom.events.ChangeEventHandler<NativeFormControlElement>?

    /**
     * If `true`, the label will indicate that the `input` is required.
     * @default false
     */
    var required: Boolean?

    /**
     * The props used for each slot inside the FormControl.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', FormControlRootSlotPropsOverrides, FormControlOwnerState> */
    }

    /**
     * The components used for each slot inside the FormControl.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: FormControlSlots?

    /**
     * The value of the form element.
     */
    var value: Any?
}

external interface FormControlSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: react.ElementType<*>?
}
