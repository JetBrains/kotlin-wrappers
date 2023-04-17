// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface SelectUnstyledProps<TValue> :
    SelectUnstyledOwnProps<TValue> {
    var component: react.ElementType<*>?
}

external interface SelectUnstyledCommonProps :
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
     * If `true`, the select is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, the select will be initially open.
     * @default false
     */
    var defaultListboxOpen: Boolean?

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
     * Name of the element. For example used by the server to identify the fields in form submits.
     * If the name is provided, the component will render a hidden input element that can be submitted to a server.
     */
    var name: String?

    /**
     * Callback fired when the component requests to be opened.
     * Use in controlled mode (see listboxOpen).
     */
    var onListboxOpenChange: ((isOpen: Boolean) -> Unit)?
}

external interface SelectUnstyledOwnProps<TValue> :
    SelectUnstyledCommonProps {
    /**
     * The components used for each slot inside the Select.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
        var Listbox: react.ElementType<*>?
        var Popper: react.ElementType<*>? /* React.ComponentType<SelectUnstyledPopperSlotProps<TValue>> */
    }

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* SlotComponentProps<'button', SelectUnstyledComponentsPropsOverrides, SelectUnstyledOwnerState<TValue>> */
        var listbox: react.Props? /* SlotComponentProps<'button', SelectUnstyledComponentsPropsOverrides, SelectUnstyledOwnerState<TValue>> */
        var popper: react.Props? /* SlotComponentProps<typeof PopperUnstyled, SelectUnstyledComponentsPropsOverrides, SelectUnstyledOwnerState<TValue>> */
    }

    /**
     * The default selected value. Use when the component is not controlled.
     */
    var defaultValue: TValue?

    /**
     * A function to convert the currently selected value to a string.
     * Used to set a value of a hidden input associated with the select,
     * so that the selected value can be posted with a form.
     */
    var getSerializedValue: ((option: SelectOption<TValue>?) -> Any /* String | ReadonlyArray<String> | Number */)?

    /**
     * Callback fired when an option is selected.
     */
    var onChange: ((e: react.dom.events.SyntheticEvent<*, *>?, value: TValue?) -> Unit)?

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
    var renderValue: ((option: SelectOption<TValue>?) -> react.ReactNode)?

    /**
     * The selected value.
     * Set to `null` to deselect all options.
     */
    var value: TValue?
}

external interface SelectUnstyledOwnerState<TValue> : SelectUnstyledOwnProps<TValue> {
    var active: Boolean

    override var disabled: Boolean?

    var focusVisible: Boolean

    var open: Boolean
}
