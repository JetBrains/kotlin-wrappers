// Automatically generated - do not modify!

package mui.base

import js.core.ReadonlyArray

external interface MultiSelectUnstyledProps<TValue> :
    MultiSelectUnstyledOwnProps<TValue> {
    var component: react.ElementType<*>?
}

external interface MultiSelectUnstyledOwnProps<TValue> :
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
        var Popper: react.ElementType<*>? /* React.ComponentType<MultiSelectUnstyledPopperSlotProps<TValue>> */
    }

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* SlotComponentProps<'button', MultiSelectUnstyledComponentsPropsOverrides, MultiSelectUnstyledOwnerState<TValue>> */
        var listbox: react.Props? /* SlotComponentProps<'button', MultiSelectUnstyledComponentsPropsOverrides, MultiSelectUnstyledOwnerState<TValue>> */
        var popper: react.Props? /* SlotComponentProps<typeof PopperUnstyled, MultiSelectUnstyledComponentsPropsOverrides, MultiSelectUnstyledOwnerState<TValue>> */
    }

    /**
     * The default selected values. Use when the component is not controlled.
     * @default []
     */
    var defaultValue: ReadonlyArray<TValue>?

    /**
     * Callback fired when an option is selected.
     */
    var onChange: ((value: ReadonlyArray<TValue>) -> Unit)?

    /**
     * Function that customizes the rendering of the selected values.
     */
    var renderValue: ((option: ReadonlyArray<SelectOption<TValue>>) -> react.ReactNode)?

    /**
     * The selected values.
     * Set to an empty array to deselect all options.
     */
    var value: ReadonlyArray<TValue>?
}

external interface MultiSelectUnstyledType {
    var propTypes: Any?
}

external interface MultiSelectUnstyledOwnerState<TValue> : MultiSelectUnstyledProps<TValue> {
    var active: Boolean

    override var disabled: Boolean?

    var open: Boolean

    var focusVisible: Boolean
}
