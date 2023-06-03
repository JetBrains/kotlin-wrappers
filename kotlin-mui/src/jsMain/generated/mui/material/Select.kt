// Automatically generated - do not modify!

@file:JsModule("@mui/material/Select")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface SelectProps<T> :
    mui.system.StandardProps,
    InputProps,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * If `true`, the width of the popover will automatically be set according to the items inside the
     * menu, otherwise it will be at least the width of the select input.
     * @default false
     */
    var autoWidth: Boolean?

    /**
     * The option elements to populate the select with.
     * Can be some `MenuItem` when `native` is false and `option` when `native` is true.
     *
     * ⚠️The `MenuItem` elements **must** be direct descendants when `native` is false.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     * @default {}
     */
    var classes: SelectClasses?

    /**
     * If `true`, the component is initially open. Use when the component open state is not controlled (i.e. the `open` prop is not defined).
     * You can only use it when the `native` prop is `false` (default).
     * @default false
     */
    var defaultOpen: Boolean?

    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: T?

    /**
     * If `true`, a value is displayed even if no items are selected.
     *
     * In order to display a meaningful value, a function can be passed to the `renderValue` prop which
     * returns the value to be displayed when no items are selected.
     *
     * ⚠️ When using this prop, make sure the label doesn't overlap with the empty displayed value.
     * The label should either be hidden or forced to a shrunk state.
     * @default false
     */
    var displayEmpty: Boolean?

    /**
     * The icon that displays the arrow.
     * @default ArrowDropDownIcon
     */
    var IconComponent: react.ElementType<*>?

    /**
     * The `id` of the wrapper element or the `select` element when `native`.
     */
    var id: String?

    /**
     * An `Input` element; does not have to be a material-ui specific `Input`.
     */
    var input: react.ReactElement<*>?

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
     * When `native` is `true`, the attributes are applied on the `select` element.
     */
    var inputProps: InputBaseComponentProps?

    /**
     * See [OutlinedInput#label](/material-ui/api/outlined-input/#props)
     */
    var label: react.ReactNode?

    /**
     * The ID of an element that acts as an additional label. The Select will
     * be labelled by the additional label and the selected value.
     */
    var labelId: String?

    /**
     * Props applied to the [`Menu`](/material-ui/api/menu/) element.
     */
    var MenuProps: MenuProps?

    /**
     * If `true`, `value` must be an array and the menu will support multiple selections.
     * @default false
     */
    var multiple: Boolean?

    /**
     * If `true`, the component uses a native `select` element.
     * @default false
     */
    var native: Boolean?

    /**
     * Callback fired when a menu item is selected.
     *
     * @param {SelectChangeEvent<T>} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (any).
     * **Warning**: This is a generic event, not a change event, unless the change event is caused by browser autofill.
     * @param {object} [child] The react element that was selected when `native` is `false` (default).
     */
    var onChange: ((event: react.dom.events.ChangeEvent<web.html.HTMLInputElement>, child: react.ReactNode) -> Unit)?

    /**
     * Callback fired when the component requests to be closed.
     * Use it in either controlled (see the `open` prop), or uncontrolled mode (to detect when the Select collapes).
     *
     * @param {object} event The event source of the callback.
     */
    var onClose: ((event: react.dom.events.SyntheticEvent<*, *>) -> Unit)?

    /**
     * Callback fired when the component requests to be opened.
     * Use it in either controlled (see the `open` prop), or uncontrolled mode (to detect when the Select expands).
     *
     * @param {object} event The event source of the callback.
     */
    var onOpen: ((event: react.dom.events.SyntheticEvent<*, *>) -> Unit)?

    /**
     * If `true`, the component is shown.
     * You can only use it when the `native` prop is `false` (default).
     */
    var open: Boolean?

    /**
     * Render the selected value.
     * You can only use it when the `native` prop is `false` (default).
     *
     * @param {any} value The `value` provided to the component.
     * @returns {ReactNode}
     */
    var renderValue: ((value: T) -> react.ReactNode)?

    /**
     * Props applied to the clickable div element.
     */
    var SelectDisplayProps: react.dom.html.HTMLAttributes<web.html.HTMLDivElement>?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The `input` value. Providing an empty string will select no options.
     * Set to an empty string `''` if you don't want any of the available options to be selected.
     *
     * If the value is an object it must have reference equality with the option in order to be selected.
     * If the value is not an object, the string representation must match with the string representation of the option in order to be selected.
     */
    var value: dynamic

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: SelectVariant?
}

/**
 *
 * Demos:
 *
 * - [Select](https://mui.com/material-ui/react-select/)
 *
 * API:
 *
 * - [Select API](https://mui.com/material-ui/api/select/)
 * - inherits [OutlinedInput API](https://mui.com/material-ui/api/outlined-input/)
 */
@JsName("default")
external val Select: react.FC<SelectProps<*>>
