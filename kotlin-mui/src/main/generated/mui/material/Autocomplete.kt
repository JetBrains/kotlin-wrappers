// Automatically generated - do not modify!

@file:JsModule("@mui/material/Autocomplete")
@file:JsNonModule

package mui.material

import js.core.ReadonlyArray
import mui.material.styles.Theme
import mui.system.SxProps

external interface AutocompleteProps<T> :
    mui.base.UseAutocompleteProps<T>,
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.system.PropsWithSx {
    /**
     * Props applied to the [`Chip`](/material-ui/api/chip/) element.
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
    var clearIcon: react.ReactNode?

    /**
     * Override the default text for the *clear* icon button.
     *
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @default 'Clear'
     */
    var clearText: String?

    /**
     * Override the default text for the *close popup* icon button.
     *
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @default 'Close'
     */
    var closeText: String?

    /**
     * The props used for each slot inside.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var clearIndicator: react.Props? /* Partial<IconButtonProps> */
        var paper: react.Props? /* PaperProps */
        var popper: react.Props? /* Partial<PopperProps> */
        var popupIndicator: react.Props? /* Partial<IconButtonProps> */
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
    var forcePopupIcon: dynamic

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
    var getLimitTagsText: ((more: Number) -> react.ReactNode)?

    /**
     * The component used to render the listbox.
     * @default 'ul'
     */
    var ListboxComponent: react.ComponentType<*>?

    /**
     * Props applied to the Listbox element.
     */
    var ListboxProps: react.Props? /* ReturnType<ReturnType<typeof useAutocomplete>['getListboxProps']> */

    /**
     * If `true`, the component is in a loading state.
     * This shows the `loadingText` in place of suggestions (only if there are no suggestions to show, e.g. `options` are empty).
     * @default false
     */
    var loading: Boolean?

    /**
     * Text to display when in a loading state.
     *
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @default 'Loading…'
     */
    var loadingText: react.ReactNode?

    /**
     * The maximum number of tags that will be visible when not focused.
     * Set `-1` to disable the limit.
     * @default -1
     */
    var limitTags: Number?

    /**
     * Text to display when there are no options.
     *
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @default 'No options'
     */
    var noOptionsText: react.ReactNode?

    /**
     * Override the default text for the *open popup* icon button.
     *
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @default 'Open'
     */
    var openText: String?

    /**
     * The component used to render the body of the popup.
     * @default Paper
     */
    var PaperComponent: react.ComponentType<*>?

    /**
     * The component used to position the popup.
     * @default Popper
     */
    var PopperComponent: react.ComponentType<PopperProps>?

    /**
     * The icon to display in place of the default popup icon.
     * @default <ArrowDropDownIcon />
     */
    var popupIcon: react.ReactNode?

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
    var renderGroup: ((params: AutocompleteRenderGroupParams) -> react.ReactNode)?

    /**
     * Render the input.
     *
     * @param {object} params
     * @returns {ReactNode}
     */
    var renderInput: (params: AutocompleteRenderInputParams) -> react.ReactNode

    /**
     * Render the option, use `getOptionLabel` by default.
     *
     * @param {object} props The props to apply on the li element.
     * @param {T} option The option to render.
     * @param {object} state The state of the component.
     * @returns {ReactNode}
     */
    var renderOption: ((
        props: react.dom.html.HTMLAttributes<web.html.HTMLLIElement>,
        option: T,
        state: AutocompleteRenderOptionState,
    ) -> react.ReactNode)?

    /**
     * Render the selected value.
     *
     * @param {T[]} value The `value` provided to the component.
     * @param {function} getTagProps A tag props getter.
     * @param {object} ownerState The state of the Autocomplete component.
     * @returns {ReactNode}
     */
    var renderTags: ((
        value: ReadonlyArray<T>,
        getTagProps: Function<*>, /* AutocompleteRenderGetTagProps */
        ownerState: AutocompleteProps<T>, /* AutocompleteOwnerState<T> */
    ) -> react.ReactNode)?

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: mui.system.Union? /* 'small' | 'medium', AutocompletePropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface AutocompleteRenderOptionState {
    var inputValue: String

    var selected: Boolean
}

external interface AutocompleteRenderGroupParams : react.PropsWithChildren {
    override var key: react.Key? /* Key */

    var group: String

    override var children: react.ReactNode?
}

external interface AutocompleteRenderInputParams : react.Props {
    var id: String

    var disabled: Boolean

    var fullWidth: Boolean

    var size: mui.system.Union /* 'small' | undefined */

    var InputLabelProps: react.Props /* ReturnType<ReturnType<typeof useAutocomplete>['getInputLabelProps']> */

    var InputProps: react.Props /* { ref: React.Ref<any>; className: string; startAdornment: React.ReactNode; endAdornment: React.ReactNode; } */

    var inputProps: react.Props /* ReturnType<ReturnType<typeof useAutocomplete>['getInputProps']> */
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
external val Autocomplete: react.FC<AutocompleteProps<*>>
