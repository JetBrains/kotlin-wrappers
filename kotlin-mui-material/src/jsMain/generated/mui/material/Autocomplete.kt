// Automatically generated - do not modify!

@file:JsModule("@mui/material/Autocomplete")

package mui.material

import mui.base.UseAutocompleteProps
import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import mui.system.Union
import react.*
import react.dom.html.HTMLAttributes
import web.dom.ElementId
import web.html.HTMLDivElement
import web.html.HTMLLIElement

external interface AutocompleteProps<Value> :
    UseAutocompleteProps<Value>,
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AutocompleteClasses?

    /**
     * The icon to display in place of the default clear icon.
     * @default <ClearIcon fontSize="small" />
     */
    var clearIcon: ReactNode?

    /**
     * Override the default text for the *clear* icon button.
     *
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @default 'Clear'
     */
    var clearText: String?

    /**
     * Override the default text for the *close popup* icon button.
     *
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @default 'Close'
     */
    var closeText: String?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    override var disabled: Boolean?

    /**
     * If `true`, the `Popper` content will be under the DOM hierarchy of the parent component.
     * @default false
     */
    var disablePortal: Boolean?

    /**
     * Force the visibility display of the popup icon.
     * @default 'auto'
     */
    var forcePopupIcon: Any? /* true | false | 'auto' */

    /**
     * If `true`, the input takes up the full width of its container.
     *
     * `Autocomplete` treats `undefined` and `false` differently.
     * If `undefined`, the inner input takes up the full width of its container.
     * If `false`, the inner input is restricted to its intrinsic width.
     * @default false
     */
    var fullWidth: Boolean?

    /**
     * The label to display when the tags are truncated (`limitTags`).
     *
     * @param {number} more The number of truncated tags.
     * @returns {ReactNode}
     * @default (more) => `+${more}`
     */
    var getLimitTagsText: ((more: Number) -> ReactNode)?

    /**
     * If `true`, the component is in a loading state.
     * This shows the `loadingText` in place of suggestions (only if there are no suggestions to show, for example `options` are empty).
     * @default false
     */
    var loading: Boolean?

    /**
     * Text to display when in a loading state.
     *
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @default 'Loading…'
     */
    var loadingText: ReactNode?

    /**
     * The maximum number of tags that will be visible when not focused.
     * Set `-1` to disable the limit.
     * @default -1
     */
    var limitTags: Int?

    /**
     * Text to display when there are no options.
     *
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @default 'No options'
     */
    var noOptionsText: ReactNode?

    override var onKeyDown: ((event: react.dom.events.KeyboardEvent<HTMLDivElement>) -> Unit)?

    /**
     * Override the default text for the *open popup* icon button.
     *
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @default 'Open'
     */
    var openText: String?

    /**
     * The icon to display in place of the default popup icon.
     * @default <ArrowDropDownIcon />
     */
    var popupIcon: ReactNode?

    /**
     * If `true`, the component becomes readonly. It is also supported for multiple tags where the tag cannot be deleted.
     * @default false
     */
    override var readOnly: Boolean?

    /**
     * Render the group.
     *
     * @param {AutocompleteRenderGroupParams} params The group to render.
     * @returns {ReactNode}
     */
    var renderGroup: ((params: AutocompleteRenderGroupParams) -> ReactNode)?

    /**
     * Render the input.
     *
     * **Note:** The `renderInput` prop must return a `TextField` component or a compatible custom component
     * that correctly forwards `InputProps.ref` and spreads `inputProps`. This ensures proper integration
     * with the Autocomplete's internal logic (e.g., focus management and keyboard navigation).
     *
     * Avoid using components like `DatePicker` or `Select` directly, as they may not forward the required props,
     * leading to runtime errors or unexpected behavior.
     *
     * @param {object} params
     * @returns {ReactNode}
     */
    var renderInput: (params: AutocompleteRenderInputParams) -> ReactNode

    /**
     * Render the option, use `getOptionLabel` by default.
     *
     * @param {object} props The props to apply on the li element.
     * @param {Value} option The option to render.
     * @param {object} state The state of each option.
     * @param {object} ownerState The state of the Autocomplete component.
     * @returns {ReactNode}
     */
    var renderOption: ((props: HTMLAttributes<HTMLLIElement>, option: Value, state: AutocompleteRenderOptionState, ownerState: AutocompleteOwnerState<Value>) -> ReactNode)?

    /**
     * Renders the selected value(s) as rich content in the input for both single and multiple selections.
     *
     * @param {any} value The `value` provided to the component.
     * @param {function} getItemProps The value item props.
     * @param {object} ownerState The state of the Autocomplete component.
     * @returns {ReactNode}
     */
    var renderValue: ((value: Any, getItemProps: Any, ownerState: AutocompleteOwnerState<Value>) -> ReactNode)?

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: BaseSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface AutocompleteOwnerState<Value> : AutocompleteProps<Value> {
    var expanded: Boolean

    var focused: Boolean

    var hasClearIcon: Boolean

    var hasPopupIcon: Boolean

    var inputFocused: Boolean

    var popupOpen: Boolean
}

external interface AutocompleteRenderOptionState {
    var inputValue: String

    var index: Number

    var selected: Boolean
}

external interface AutocompleteRenderGroupParams : PropsWithChildren {
    override var key: Key? /* Key */

    var group: String

    override var children: ReactNode?
}

external interface AutocompleteRenderInputParams : Props {
    var id: ElementId?

    var disabled: Boolean

    var fullWidth: Boolean

    var size: Union /* 'small' */

    var slotProps: SlotProps

    interface SlotProps {
        var inputLabel: Props? /* ReturnType<ReturnType<typeof useAutocomplete>['getInputLabelProps']> */
        var input: Any?
        var htmlInput: Props? /* ReturnType<ReturnType<typeof useAutocomplete>['getInputProps']> */
    }
}

external interface AutocompleteSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: ElementType<*>

    /**
     * The component used to render the clear indicator element.
     * @default IconButton
     */
    var clearIndicator: ComponentType<IconButtonProps>

    /**
     * The component used to render the popup indicator element.
     * @default IconButton
     */
    var popupIndicator: ComponentType<IconButtonProps>

    /**
     * The component used to render the listbox.
     * @default 'ul'
     */
    var listbox: ComponentType<*>

    /**
     * The component used to render the body of the popup.
     * @default Paper
     */
    var paper: ComponentType<*>

    /**
     * The component used to position the popup.
     * @default Popper
     */
    var popper: ComponentType<*>
}

/**
 *
 * Demos:
 *
 * - [Autocomplete](https://mui.com/material-ui/react-autocomplete/)
 *
 * API:
 *
 * - [Autocomplete API](https://mui.com/material-ui/api/autocomplete/)
 */
@JsName("default")
external val Autocomplete: FC<AutocompleteProps<*>>
