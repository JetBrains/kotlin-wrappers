// Automatically generated - do not modify!

package mui.base

external interface SelectUnstyledProps<TValue> : react.Props {
    /**
     * The default selected value. Use when the component is not controlled.
     */
    var defaultValue: TValue?

    /**
     * Callback fired when an option is selected.
     */
    var onChange: ((value: TValue?) -> Unit)?

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

external interface SelectUnstyledCommonProps : react.PropsWithChildren {
    /**
     * If `true`, the select element is focused during the first mount
     * @default false
     */
    var autoFocus: Boolean?

    override var children: react.ReactNode?

    var className: String?

    var component: react.ElementType<*>?

    /**
     * The components used for each slot inside the Select.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var componentsProps: dynamic

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
     * Controls the open state of the select's listbox.
     * @default undefined
     */
    var listboxOpen: Boolean?

    /**
     * Callback fired when the component requests to be opened.
     * Use in controlled mode (see listboxOpen).
     */
    var onListboxOpenChange: ((isOpen: Boolean) -> Unit)?
}

external interface SelectUnstyledOwnerState {
    var active: Boolean

    var disabled: Boolean

    var open: Boolean

    var focusVisible: Boolean
}
