// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface SelectProps<OptionValue> :
    SelectOwnProps<OptionValue> {
    var component: react.ElementType<*>?
}

external interface SelectOwnProps<OptionValue> :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * A function used to determine if two options' values are equal.
     * By default, reference equality is used.
     *
     * There is a performance impact when using the `areOptionsEqual` prop (proportional to the number of options).
     * Therefore, it's recommented to use the default reference equality comparison whenever possible.
     */
    var areOptionsEqual: ((a: OptionValue, b: OptionValue) -> Boolean)?

    /**
     * This prop helps users to fill forms faster, especially on mobile devices.
     * The name can be confusing, as it's more like an autofill.
     * You can learn more about it [following the specification](https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill).
     */
    var autoComplete: String?

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
    var defaultValue: Any? /* SelectValue<OptionValue, Multiple> */

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
    var getSerializedValue: Any? /* (option: SelectValue<SelectOption<OptionValue>, Multiple>) => React.InputHTMLAttributes<HTMLInputElement>['value'] */

    /**
     * `id` attribute of the listbox element.
     */
    var listboxId: String?

    /**
     * Controls the open state of the select's listbox.
     * @default undefined
     */
    var listboxOpen: Boolean?

    /**
     * If `true`, selecting multiple values is allowed.
     * This affects the type of the `value`, `defaultValue`, and `onChange` props.
     *
     * @default false
     */
    var multiple: Any? /* Multiple */

    /**
     * Name of the element. For example used by the server to identify the fields in form submits.
     */
    var name: String?

    /**
     * Callback fired when an option is selected.
     */
    var onChange: Any? /* (event: React.MouseEvent | React.KeyboardEvent | React.FocusEvent | null, value: SelectValue<OptionValue, Multiple>) => void */

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
    var getOptionAsString: ((option: SelectOption<OptionValue>) -> String)?

    /**
     * Function that customizes the rendering of the selected value.
     */
    var renderValue: Any? /* (option: SelectValue<SelectOption<OptionValue>, Multiple>) => React.ReactNode */

    /**
     * Text to show when there is no selected value.
     */
    var placeholder: react.ReactNode?

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'button', SelectRootSlotPropsOverrides, SelectOwnerState<OptionValue, Multiple>> */
        var listbox: react.Props? /* SlotComponentProps<'ul', SelectListboxSlotPropsOverrides, SelectOwnerState<OptionValue, Multiple>> */
        var popper: react.Props? /* SlotComponentProps<typeof Popper, SelectPopperSlotPropsOverrides, SelectOwnerState<OptionValue, Multiple>> */
    }

    /**
     * If `true`, the Select cannot be empty when submitting form.
     * @default false
     */
    var required: Boolean?

    /**
     * The components used for each slot inside the Select.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: SelectSlots?

    /**
     * The selected value.
     * Set to `null` to deselect all options.
     */
    var value: Any? /* SelectValue<OptionValue, Multiple> */
}

external interface SelectSlots {
    /**
     * The component that renders the root.
     * @default 'button'
     */
    var root: react.ElementType<*>?

    /**
     * The component that renders the listbox.
     * @default 'ul'
     */
    var listbox: react.ElementType<*>?

    /**
     * The component that renders the popper.
     * @default Popper
     */
    var popper: react.ComponentType<*>?
}
