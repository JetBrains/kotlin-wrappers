// Automatically generated - do not modify!

package mui.base

import js.array.ReadonlyArray
import web.html.HTMLElement

external interface CreateFilterOptionsConfig<Value> {
    var ignoreAccents: Boolean?

    var ignoreCase: Boolean?

    var limit: Number?

    var matchFrom: MatchFrom?

    var stringify: ((option: Value) -> String)?

    var trim: Boolean?
}

external interface FilterOptionsState<Value> {
    var inputValue: String

    var getOptionLabel: (option: Value) -> String
}

external interface AutocompleteGroupedOption {
    var key: Number

    var index: Number

    var group: String

    var options: dynamic
}

external interface UseAutocompleteProps<Value> : react.Props {
    /**
     * @internal The prefix of the state class name, temporary for Joy UI
     * @default 'Mui'
     */
    var unstable_classNamePrefix: String?

    /**
     * @internal
     * Temporary for Joy UI because the parent listbox is the document object
     * TODO v6: Normalize the logic and remove this param.
     */
    var unstable_isActiveElementInListbox: ((listbox: react.RefObject<HTMLElement>) -> Boolean)?

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
     *
     * When using `freeSolo` mode, the typed value will be the input value
     * if the Autocomplete loses focus without highlighting an option.
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
     * The default value. Use when the component is not controlled.
     * @default props.multiple ? [] : null
     */
    var defaultValue: dynamic

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
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

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
     * A function that determines the filtered options to be rendered on search.
     *
     * @default createFilterOptions()
     * @param {Value[]} options The options to render.
     * @param {object} state The state of the component.
     * @returns {Value[]}
     */
    var filterOptions: ((options: ReadonlyArray<Value>, state: FilterOptionsState<Value>) -> ReadonlyArray<Value>)?

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
     * @param {Value} option The option to test.
     * @returns {boolean}
     */
    var getOptionDisabled: ((option: Value) -> Boolean)?

    /**
     * Used to determine the string value for a given option.
     * It's used to fill the input (and the list box options if `renderOption` is not provided).
     *
     * If used in free solo mode, it must accept both the type of the options and a string.
     *
     * @param {Value} option
     * @returns {string}
     * @default (option) => option.label ?? option
     */
    var getOptionLabel: ((option: Value /* or AutocompleteFreeSoloValueMapping<FreeSolo> */) -> String)?

    /**
     * If provided, the options will be grouped under the returned string.
     * The groupBy value is also used as the text for group headings when `renderGroup` is not provided.
     *
     * @param {Value} options The options to group.
     * @returns {string}
     */
    var groupBy: ((option: Value) -> String)?

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
     * Used to determine if the option represents the given value.
     * Uses strict equality by default.
     * ⚠️ Both arguments need to be handled, an option can only match with one value.
     *
     * @param {Value} option The option to test.
     * @param {Value} value The value to test against.
     * @returns {boolean}
     */
    var isOptionEqualToValue: ((option: Value, value: Value) -> Boolean)?

    /**
     * If `true`, `value` must be an array and the menu will support multiple selections.
     * @default false
     */
    var multiple: Any? /* Multiple */

    /**
     * Callback fired when the value changes.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {Value|Value[]} value The new value of the component.
     * @param {string} reason One of "createOption", "selectOption", "removeOption", "blur" or "clear".
     * @param {string} [details]
     */
    var onChange: ((
        event: react.dom.events.SyntheticEvent<*, *>,
        value: dynamic,
        reason: AutocompleteChangeReason,
        details: AutocompleteChangeDetails<Value>?,
    ) -> Unit)?

    /**
     * Callback fired when the popup requests to be closed.
     * Use in controlled mode (see open).
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {string} reason Can be: `"toggleInput"`, `"escape"`, `"selectOption"`, `"removeOption"`, `"blur"`.
     */
    var onClose: ((event: react.dom.events.SyntheticEvent<*, *>, reason: AutocompleteCloseReason) -> Unit)?

    /**
     * Callback fired when the highlight option changes.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {Value} option The highlighted option.
     * @param {string} reason Can be: `"keyboard"`, `"auto"`, `"mouse"`, `"touch"`.
     */
    var onHighlightChange: ((
        event: react.dom.events.SyntheticEvent<*, *>,
        option: Value?,
        reason: AutocompleteHighlightChangeReason,
    ) -> Unit)?

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
    var options: ReadonlyArray<Value>

    /**
     * If `true`, the component becomes readonly. It is also supported for multiple tags where the tag cannot be deleted.
     * @default false
     */
    var readOnly: Boolean?

    /**
     * If `true`, the input's text is selected on focus.
     * It helps the user clear the selected value.
     * @default !props.freeSolo
     */
    var selectOnFocus: Boolean?

    /**
     * The value of the autocomplete.
     *
     * The value must have reference equality with the option in order to be selected.
     * You can customize the equality behavior with the `isOptionEqualToValue` prop.
     */
    var value: Any? /* AutocompleteValue<Value, Multiple, DisableClearable, FreeSolo> */
}

external interface AutocompleteChangeDetails<Value> {
    var option: Value
}

external interface UseAutocompleteRenderedOption<Value> {
    var option: Value

    var index: Number
}

external interface UseAutocompleteReturnValue<Value> {
    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: (externalProps: Any?) -> react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

    /**
     * Resolver for the input element's props.
     * @returns props that should be spread on the input element
     */
    var getInputProps: () -> react.dom.html.InputHTMLAttributes<web.html.HTMLInputElement>

    /**
     * Resolver for the input label element's props.
     * @returns props that should be spread on the input label element
     */
    var getInputLabelProps: () -> react.dom.html.InputHTMLAttributes<web.html.HTMLLabelElement>

    /**
     * Resolver for the `clear` button element's props.
     * @returns props that should be spread on the *clear* button element
     */
    var getClearProps: () -> react.dom.html.HTMLAttributes<web.html.HTMLButtonElement>

    /**
     * Resolver for the popup icon's props.
     * @returns props that should be spread on the popup icon
     */
    var getPopupIndicatorProps: () -> react.dom.html.HTMLAttributes<web.html.HTMLButtonElement>

    /**
     * A tag props getter.
     */
    var getTagProps: Any /* AutocompleteGetTagProps */

    /**
     * Resolver for the listbox component's props.
     * @returns props that should be spread on the listbox component
     */
    var getListboxProps: () -> react.dom.html.HTMLAttributes<web.html.HTMLUListElement>

    /**
     * Resolver for the rendered option element's props.
     * @param renderedOption option rendered on the Autocomplete
     * @returns props that should be spread on the li element
     */
    var getOptionProps: (
        renderedOption: UseAutocompleteRenderedOption<Value>,
    ) -> react.dom.html.HTMLAttributes<web.html.HTMLLIElement>

    /**
     * Id for the Autocomplete.
     */
    var id: String

    /**
     * The input value.
     */
    var inputValue: String

    /**
     * The value of the autocomplete.
     */
    var value: Any /* AutocompleteValue<Value, Multiple, DisableClearable, FreeSolo> */

    /**
     * If `true`, the component input has some values.
     */
    var dirty: Boolean

    /**
     * If `true`, the listbox is being displayed.
     */
    var expanded: Boolean

    /**
     * If `true`, the popup is open on the component.
     */
    var popupOpen: Boolean

    /**
     * If `true`, the component is focused.
     */
    var focused: Boolean

    /**
     * An HTML element that is used to set the position of the component.
     */
    var anchorEl: HTMLElement?

    /**
     * Setter for the component `anchorEl`.
     * @returns function for setting `anchorEl`
     */
    var setAnchorEl: () -> Unit

    /**
     * Index of the focused tag for the component.
     */
    var focusedTag: Number

    /**
     * The options to render. It's either `Value[]` or `AutocompleteGroupedOption<Value>[]` if the groupBy prop is provided.
     */
    var groupedOptions: Any /* Value[] | Array<AutocompleteGroupedOption<Value>> */
}
