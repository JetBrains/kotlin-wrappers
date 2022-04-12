// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface SelectUnstyledProps<TValue> : react.Props {
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
        var root: react.Props? /* React.ComponentPropsWithRef<'button'> & SelectUnstyledComponentsPropsOverrides */
        var listbox: react.Props? /* React.ComponentPropsWithRef<'ul'> & SelectUnstyledComponentsPropsOverrides */
        var popper: react.Props? /* Partial<React.ComponentPropsWithRef<typeof PopperUnstyled>> & SelectUnstyledComponentsPropsOverrides */
    }

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

    var component: react.ElementType<*>?

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

    var focusVisible: Boolean

    var open: Boolean
}
