// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface SelectUnstyledProps<TValue> :
    SelectUnstyledOwnProps<TValue> {
    var component: react.ElementType<*>?
}

external interface SelectUnstyledOwnProps<TValue> :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * If `true`, the select element is focused during the first mount
     * @default false
     */
    var autoFocus: Boolean?

    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * If `true`, the select will be initially open.
     * @default false
     */
    var defaultListboxOpen: Boolean?

    /**
     * The default selected value. Use when the component is not controlled.
     */
    var defaultValue: Any? /* SelectValue<TValue, Multiple> */

    /**
     * If `true`, the select is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * A function to convert the currently selected value to a string.
     * Used to set a value of a hidden input associated with the select,
     * so that the selected value can be posted with a form.
     */
    var getSerializedValue: Any? /* (option: SelectValue<SelectOption<TValue>, Multiple>) => React.InputHTMLAttributes<HTMLInputElement>['value'] */

    /**
     * `id` attribute of the listbox element.
     * Also used to derive the `id` attributes of options.
     */
    var listboxId: String?

    /**
     * Controls the open state of the select's listbox.
     * @default undefined
     */
    var listboxOpen: Boolean?

    /**
     * If `true`, selecting multiple values is allowed.
     *
     * @default false
     */
    var multiple: Any? /* Multiple? /* Boolean */ */

    /**
     * Name of the element. For example used by the server to identify the fields in form submits.
     * If the name is provided, the component will render a hidden input element that can be submitted to a server.
     */
    var name: String?

    /**
     * Callback fired when an option is selected.
     */
    var onChange: Any? /* (e: React.MouseEvent | React.KeyboardEvent | React.FocusEvent | null, value: SelectValue<TValue, Multiple>) => void */

    /**
     * Callback fired when the component requests to be opened.
     * Use in controlled mode (see listboxOpen).
     */
    var onListboxOpenChange: ((isOpen: Boolean) -> Unit)?

    /**
     * A function used to convert the option label to a string.
     * It's useful when labels are elements and need to be converted to plain text
     * to enable navigation using character keys on a keyboard.
     *
     * @default defaultOptionStringifier
     */
    var optionStringifier: ((option: SelectOption<TValue>) -> String)?

    /**
     * Function that customizes the rendering of the selected value.
     */
    var renderValue: Any? /* (option: SelectValue<SelectOption<TValue>, Multiple>) => React.ReactNode */

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'button', SelectUnstyledRootSlotPropsOverrides, SelectUnstyledOwnerState<TValue, Multiple>> */
        var listbox: react.Props? /* SlotComponentProps<'ul', SelectUnstyledListboxSlotPropsOverrides, SelectUnstyledOwnerState<TValue, Multiple>> */
        var popper: react.Props? /* SlotComponentProps<typeof PopperUnstyled, SelectUnstyledPopperSlotPropsOverrides, SelectUnstyledOwnerState<TValue, Multiple>> */
    }

    /**
     * The components used for each slot inside the Select.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: SelectUnstyledSlots?

    /**
     * The selected value.
     * Set to `null` to deselect all options.
     */
    var value: Any? /* SelectValue<TValue, Multiple> */
}

external interface SelectUnstyledSlots {
    /**
     * The component used to render the root.
     * @default 'button'
     */
    var root: react.ElementType<*>?

    /**
     * The component used to render the listbox.
     * @default 'ul'
     */
    var listbox: react.ElementType<*>?

    /**
     * The component used to render the popper.
     * @default PopperUnstyled
     */
    var popper: react.ComponentType<*>?
}

external interface SelectUnstyledOwnerState<TValue> : SelectUnstyledOwnProps<TValue> {
    var active: Boolean

    override var disabled: Boolean?

    var focusVisible: Boolean

    var open: Boolean
}
