// Automatically generated - do not modify!

package mui.base

import kotlinext.js.ReadonlyArray

external interface CreateFilterOptionsConfig<T> {
    var ignoreAccents: Boolean?

    var ignoreCase: Boolean?

    var limit: Number?

    var matchFrom: MatchFrom?

    var stringify: ((option: T) -> String)?

    var trim: Boolean?
}

external interface FilterOptionsState<T> {
    var inputValue: String

    var getOptionLabel: (option: T) -> String
}

external interface AutocompleteGroupedOption {
    var key: Number

    var index: Number

    var group: String

    var options: dynamic
}

external interface UseAutocompleteProps<T> : react.Props {
    /**
     * If `true`, the portion of the selected suggestion that has not been typed by the user,
     * known as the completion string, appears inline after the input cursor in the textbox.
     * The inline completion string is visually highlighted and has a selected state.
     * @default false
     */
    var autoComplete: Boolean?

    /**
     * If `true`, the first option is automatically highlighted.
     * @default false
     */
    var autoHighlight: Boolean?

    /**
     * If `true`, the selected option becomes the value of the input
     * when the Autocomplete loses focus unless the user chooses
     * a different option or changes the character string in the input.
     * @default false
     */
    var autoSelect: Boolean?

    /**
     * Control if the input should be blurred when an option is selected:
     *
     * - `false` the input is not blurred.
     * - `true` the input is always blurred.
     * - `touch` the input is blurred after a touch event.
     * - `mouse` the input is blurred after a mouse event.
     * @default false
     */
    var blurOnSelect: BlurOnSelect?

    /**
     * If `true`, the input's text is cleared on blur if no value is selected.
     *
     * Set to `true` if you want to help the user enter a new value.
     * Set to `false` if you want to help the user resume their search.
     * @default !props.freeSolo
     */
    var clearOnBlur: Boolean?

    /**
     * If `true`, clear all values when the user presses escape and the popup is closed.
     * @default false
     */
    var clearOnEscape: Boolean?

    /**
     * The component name that is using this hook. Used for warnings.
     */
    var componentName: String?

    /**
     * If `true`, the input can't be cleared.
     * @default false
     */
    var disableClearable: Boolean?

    /**
     * If `true`, the popup won't close when a value is selected.
     * @default false
     */
    var disableCloseOnSelect: Boolean?

    /**
     * If `true`, will allow focus on disabled items.
     * @default false
     */
    var disabledItemsFocusable: Boolean?

    /**
     * If `true`, the list box in the popup will not wrap focus.
     * @default false
     */
    var disableListWrap: Boolean?

    /**
     * A filter function that determines the options that are eligible.
     *
     * @param {T[]} options The options to render.
     * @param {object} state The state of the component.
     * @returns {T[]}
     */
    var filterOptions: ((options: ReadonlyArray<T>, state: FilterOptionsState<T>) -> ReadonlyArray<T>)?

    /**
     * If `true`, hide the selected options from the list box.
     * @default false
     */
    var filterSelectedOptions: Boolean?

    /**
     * If `true`, the Autocomplete is free solo, meaning that the user input is not bound to provided options.
     * @default false
     */
    var freeSolo: Boolean?

    /**
     * Used to determine the disabled state for a given option.
     *
     * @param {T} option The option to test.
     * @returns {boolean}
     */
    var getOptionDisabled: ((option: T) -> Boolean)?

    /**
     * Used to determine the string value for a given option.
     * It's used to fill the input (and the list box options if `renderOption` is not provided).
     *
     * @param {T} option
     * @returns {string}
     * @default (option) => option.label ?? option
     */
    var getOptionLabel: ((option: T) -> String)?

    /**
     * Used to determine if the option represents the given value.
     * Uses strict equality by default.
     * ⚠️ Both arguments need to be handled, an option can only match with one value.
     *
     * @param {T} option The option to test.
     * @param {T} value The value to test against.
     * @returns {boolean}
     */
    var isOptionEqualToValue: ((option: T, value: T) -> Boolean)?

    /**
     * If provided, the options will be grouped under the returned string.
     * The groupBy value is also used as the text for group headings when `renderGroup` is not provided.
     *
     * @param {T} options The options to group.
     * @returns {string}
     */
    var groupBy: ((option: T) -> String)?

    /**
     * If `true`, the component handles the "Home" and "End" keys when the popup is open.
     * It should move focus to the first option and last option, respectively.
     * @default !props.freeSolo
     */
    var handleHomeEndKeys: Boolean?

    /**
     * This prop is used to help implement the accessibility logic.
     * If you don't provide an id it will fall back to a randomly generated one.
     */
    var id: String?

    /**
     * If `true`, the highlight can move to the input.
     * @default false
     */
    var includeInputInList: Boolean?

    /**
     * The input value.
     */
    var inputValue: String?

    /**
     * Callback fired when the popup requests to be closed.
     * Use in controlled mode (see open).
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {string} reason Can be: `"toggleInput"`, `"escape"`, `"selectOption"`, `"removeOption"`, `"blur"`.
     */
    var onClose: ((event: react.dom.events.SyntheticEvent<*, *>, reason: AutocompleteCloseReason) -> Unit)?

    /**
     * Callback fired when the input value changes.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {string} value The new value of the text input.
     * @param {string} reason Can be: `"input"` (user input), `"reset"` (programmatic change), `"clear"`.
     */
    var onInputChange: ((
        event: react.dom.events.SyntheticEvent<*, *>,
        value: String,
        reason: AutocompleteInputChangeReason,
    ) -> Unit)?

    /**
     * Callback fired when the popup requests to be opened.
     * Use in controlled mode (see open).
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     */
    var onOpen: ((event: react.dom.events.SyntheticEvent<*, *>) -> Unit)?

    /**
     * Callback fired when the highlight option changes.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {T} option The highlighted option.
     * @param {string} reason Can be: `"keyboard"`, `"auto"`, `"mouse"`.
     */
    var onHighlightChange: ((
        event: react.dom.events.SyntheticEvent<*, *>,
        option: T?,
        reason: AutocompleteHighlightChangeReason,
    ) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean?

    /**
     * If `true`, the popup will open on input focus.
     * @default false
     */
    var openOnFocus: Boolean?

    /**
     * Array of options.
     */
    var options: ReadonlyArray<T>

    /**
     * If `true`, the input's text is selected on focus.
     * It helps the user clear the selected value.
     * @default !props.freeSolo
     */
    var selectOnFocus: Boolean?

    /**
     * If `true`, `value` must be an array and the menu will support multiple selections.
     * @default false
     */
    var multiple: dynamic

    /**
     * The value of the autocomplete.
     *
     * The value must have reference equality with the option in order to be selected.
     * You can customize the equality behavior with the `isOptionEqualToValue` prop.
     */
    var value: dynamic

    /**
     * The default value. Use when the component is not controlled.
     * @default props.multiple ? [] : null
     */
    var defaultValue: dynamic

    /**
     * Callback fired when the value changes.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {T|T[]} value The new value of the component.
     * @param {string} reason One of "createOption", "selectOption", "removeOption", "blur" or "clear".
     * @param {string} [details]
     */
    var onChange: ((
        event: react.dom.events.SyntheticEvent<*, *>,
        value: dynamic,
        reason: AutocompleteChangeReason,
        details: AutocompleteChangeDetails<T>?,
    ) -> Unit)?
}

external interface AutocompleteChangeDetails<T> {
    var option: T
}
