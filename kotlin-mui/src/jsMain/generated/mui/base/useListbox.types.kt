// Automatically generated - do not modify!

package mui.base

import js.core.ReadonlyArray

external interface ListboxState<TOption> {
    var highlightedValue: TOption?

    var selectedValues: ReadonlyArray<TOption>
}

external interface UseListboxParameters<TOption> {
    /**
     * The default selected value. Use when the listbox is not controlled.
     */
    var defaultValue: ReadonlyArray<TOption>?

    /**
     * If `true`, it will be possible to highlight disabled options.
     * @default false
     */
    var disabledItemsFocusable: Boolean?

    /**
     * If `true`, the highlight will not wrap around the list if arrow keys are used.
     * @default false
     */
    var disableListWrap: Boolean?

    var focusManagement: FocusManagementType?

    /**
     * Id attribute of the listbox.
     */
    var id: String?

    /**
     * A function that determines if a particular option is disabled.
     * @default () => false
     */
    var isOptionDisabled: ((option: TOption, index: Number) -> Boolean)?

    /**
     * Ref of the listbox DOM element.
     */
    var listboxRef: react.Ref<*>?

    /**
     * Callback fired when the value changes.
     */
    var onChange: ((e: react.dom.events.SyntheticEvent<*, *>?, value: ReadonlyArray<TOption>) -> Unit)?

    /**
     * Callback fired when the highlighted option changes.
     */
    var onHighlightChange: ((e: react.dom.events.SyntheticEvent<*, *>?, option: TOption?) -> Unit)?

    /**
     * A function that tests equality between two options.
     * @default (a, b) => a === b
     */
    var optionComparer: ((optionA: TOption, optionB: TOption) -> Boolean)?

    /**
     * A function that generates the id attribute of individual options.
     */
    var optionIdGenerator: ((option: TOption, index: Number) -> String)?

    /**
     * A function that converts an object to its string representation
     * @default (o) => o
     */
    var optionStringifier: ((option: TOption) -> String?)?

    /**
     * Array of options to be rendered in the list.
     */
    var options: ReadonlyArray<TOption>

    /**
     * Maximum number of options that can be selected at once.
     * Set to `null` to disable the limit.
     */
    var selectionLimit: Number?

    /**
     * Custom state reducer function. It calculates the new state (highlighted and selected options)
     * based on the previous one and the performed action.
     */
    var stateReducer: Any? /* ListboxReducer<TOption> */

    /**
     * The selected value. Use when the listbox is controlled.
     */
    var value: ReadonlyArray<TOption>?
}

external interface OptionState {
    var disabled: Boolean

    var highlighted: Boolean

    var index: Number

    var selected: Boolean
}
