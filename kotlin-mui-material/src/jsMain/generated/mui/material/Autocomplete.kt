// Automatically generated - do not modify!

@file:JsModule("@mui/material/Autocomplete")

package mui.material

import js.array.ReadonlyArray
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
     * Props applied to the [`Chip`](https://mui.com/material-ui/api/chip/) element.
     * @deprecated Use `slotProps.chip` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var ChipProps: ChipProps?

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
     * The props used for each slot inside.
     * @deprecated Use the `slotProps` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var clearIndicator: Props? /* Partial<IconButtonProps> */
        var paper: Props? /* PaperProps */
        var popper: Props? /* Partial<PopperProps> */
        var popupIndicator: Props? /* Partial<IconButtonProps> */
    }

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
     * If `true`, the input will take up the full width of its container.
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
     * The component used to render the listbox.
     * @default 'ul'
     * @deprecated Use `slotProps.listbox.component` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var ListboxComponent: ComponentType<*>?

    /**
     * Props applied to the Listbox element.
     * @deprecated Use `slotProps.listbox` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var ListboxProps: Props? /* ReturnType<ReturnType<typeof useAutocomplete>['getListboxProps']> & { sx?: SxProps<Theme>; ref?: React.Ref<Element>; } */

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
    var limitTags: Number?

    /**
     * Text to display when there are no options.
     *
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @default 'No options'
     */
    var noOptionsText: ReactNode?

    /**
     * Override the default text for the *open popup* icon button.
     *
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @default 'Open'
     */
    var openText: String?

    /**
     * The component used to render the body of the popup.
     * @default Paper
     * @deprecated Use `slots.paper` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var PaperComponent: ComponentType<*>?

    /**
     * The component used to position the popup.
     * @default Popper
     * @deprecated Use `slots.popper` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var PopperComponent: ComponentType<PopperProps>?

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
    var renderOption: ((
        props: HTMLAttributes<HTMLLIElement>,
        option: Value,
        state: AutocompleteRenderOptionState,
        ownerState: AutocompleteProps<Value>, /* AutocompleteOwnerState<Value> */
    ) -> ReactNode)?

    /**
     * Render the selected value.
     *
     * @param {Value[]} value The `value` provided to the component.
     * @param {function} getTagProps A tag props getter.
     * @param {object} ownerState The state of the Autocomplete component.
     * @returns {ReactNode}
     */
    var renderTags: ((
        value: ReadonlyArray<Value>,
        getTagProps: Function<*>, /* AutocompleteRenderGetTagProps */
        ownerState: AutocompleteProps<Value>, /* AutocompleteOwnerState<Value> */
    ) -> ReactNode)?

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: Union? /* 'small' | 'medium', AutocompletePropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface AutocompletePaperSlotPropsOverrides

external interface AutocompletePopperSlotPropsOverrides

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

    var size: Union /* 'small' | undefined */

    var InputLabelProps: Props /* ReturnType<ReturnType<typeof useAutocomplete>['getInputLabelProps']> */

    var InputProps: Props /* { ref: React.Ref<any>; className: string; startAdornment: React.ReactNode; endAdornment: React.ReactNode; onMouseDown: React.MouseEventHandler; } */

    var inputProps: Props /* ReturnType<ReturnType<typeof useAutocomplete>['getInputProps']> */
}

external interface AutocompletePropsSizeOverrides

external interface AutocompleteSlots {
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
 * - [Autocomplete](https://v6.mui.com/material-ui/react-autocomplete/)
 *
 * API:
 *
 * - [Autocomplete API](https://v6.mui.com/material-ui/api/autocomplete/)
 */
@JsName("default")
external val Autocomplete: FC<AutocompleteProps<*>>
