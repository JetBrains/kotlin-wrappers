// Automatically generated - do not modify!

@file:JsModule("@mui/material/NativeSelect")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface NativeSelectProps :
    mui.system.StandardProps,
    InputProps,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The option elements to populate the select with.
     * Can be some `<option>` elements.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     * @default {}
     */
    var classes: NativeSelectClasses?

    /**
     * The icon that displays the arrow.
     * @default ArrowDropDownIcon
     */
    var IconComponent: react.ElementType<*>?

    /**
     * An `Input` element; does not have to be a material-ui specific `Input`.
     * @default <Input />
     */
    var input: react.ReactElement<*>?

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
    var onChange: react.dom.events.ChangeEventHandler<*>?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The `input` value. The DOM API casts this to a string.
     */
    var value: Any?

    /**
     * The variant to use.
     */
    var variant: NativeSelectVariant?
}

/**
 * An alternative to `<Select native />` with a much smaller bundle size footprint.
 *
 * Demos:
 *
 * - [Select](https://mui.com/material-ui/react-select/)
 *
 * API:
 *
 * - [NativeSelect API](https://mui.com/material-ui/api/native-select/)
 * - inherits [Input API](https://mui.com/material-ui/api/input/)
 */
@JsName("default")
external val NativeSelect: react.FC<NativeSelectProps>
