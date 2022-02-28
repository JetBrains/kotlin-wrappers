// Automatically generated - do not modify!

package mui.base

import kotlinx.js.ReadonlyArray

external interface MultiSelectUnstyledProps<TValue> : react.Props {
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

external interface MultiSelectUnstyledOwnerState<TValue> : MultiSelectUnstyledProps<TValue> {
    var active: Boolean

    var disabled: Boolean

    var open: Boolean

    var focusVisible: Boolean
}
