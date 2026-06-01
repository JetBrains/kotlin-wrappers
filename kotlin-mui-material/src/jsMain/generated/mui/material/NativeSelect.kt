// Automatically generated - do not modify!

@file:JsModule("@mui/material/NativeSelect")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.ElementType
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.events.ChangeEventHandler

external interface NativeSelectProps :
    StandardProps,
    InputProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The option elements to populate the select with.
     * Can be some `<option>` elements.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     * @default {}
     */
    var classes: NativeSelectClasses?

    /**
     * The icon that displays the arrow.
     * @default ArrowDropDownIcon
     */
    var IconComponent: ElementType<*>?

    /**
     * An `Input` element; does not have to be a material-ui specific `Input`.
     * @default <Input />
     */
    var input: Any? /* React.ReactElement<unknown, any> */

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select#attributes) applied to the `select` element.
     */
    var inputProps: Any? /* Partial<NativeSelectInputProps> */

    /**
     * Callback fired when a menu item is selected.
     *
     * @param {React.ChangeEvent<HTMLSelectElement>} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: ChangeEventHandler<*, *>?

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
 * - [Select](https://v6.mui.com/material-ui/react-select/)
 *
 * API:
 *
 * - [NativeSelect API](https://v6.mui.com/material-ui/api/native-select/)
 * - inherits [Input API](https://v6.mui.com/material-ui/api/input/)
 */
@JsName("default")
external val NativeSelect: FC<NativeSelectProps>
