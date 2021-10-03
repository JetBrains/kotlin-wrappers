// Automatically generated - do not modify!

@file:JsModule("@mui/material/NativeSelect")
@file:JsNonModule

package mui.material

external interface NativeSelectProps : react.PropsWithChildren {
    /**
     * The option elements to populate the select with.
     * Can be some `<option>` elements.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     * @default {}
     */
    var classes: NativeSelectClasses

    /**
     * The icon that displays the arrow.
     * @default ArrowDropDownIcon
     */
    var IconComponent: react.ElementType<*>

    /**
     * An `Input` element; does not have to be a material-ui specific `Input`.
     * @default <Input />
     */
    var input: react.ReactElement

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select#attributes) applied to the `select` element.
     */
    var inputProps: dynamic

    /**
     * Callback fired when a menu item is selected.
     *
     * @param {React.ChangeEvent<HTMLSelectElement>} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: dynamic /* NativeSelectInputProps['onChange'] */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * The `input` value. The DOM API casts this to a string.
     */
    var value: dynamic

    /**
     * The variant to use.
     */
    var variant: Union /* 'standard' | 'outlined' | 'filled' */
}

/**
 * An alternative to `<Select native />` with a much smaller bundle size footprint.
 *
 * Demos:
 *
 * - [Selects](https://mui.com/components/selects/)
 *
 * API:
 *
 * - [NativeSelect API](https://mui.com/api/native-select/)
 * - inherits [Input API](https://mui.com/api/input/)
 */
@JsName("default")
external val NativeSelect: react.FC<NativeSelectProps>
