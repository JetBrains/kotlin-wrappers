// Automatically generated - do not modify!

@file:JsModule("@mui/material/ToggleButtonGroup")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ToggleButtonGroupProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<dom.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ToggleButtonGroupClasses?

    /**
     * The color of the button when it is selected.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
     * @default 'standard'
     */
    var color: ToggleButtonGroupColor?

    /**
     * If `true`, only allow one of the child ToggleButton values to be selected.
     * @default false
     */
    var exclusive: Boolean?

    /**
     * If `true`, the component is disabled. This implies that all ToggleButton children will be disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, the button group will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean?

    /**
     * Callback fired when the value changes.
     *
     * @param {React.MouseEvent<HTMLElement>} event The event source of the callback.
     * @param {any} value of the selected buttons. When `exclusive` is true
     * this is a single value; when false an array of selected values. If no value
     * is selected and `exclusive` is true the value is null; when false an empty array.
     */
    var onChange: ((event: react.dom.events.MouseEvent<dom.html.HTMLElement, *>, value: dynamic) -> Unit)?

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: Orientation?

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: Size?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The currently selected value within the group or an array of selected
     * values when `exclusive` is false.
     *
     * The value must have reference equality with the option in order to be selected.
     */
    var value: Any?
}

/**
 *
 * Demos:
 *
 * - [Toggle button](https://mui.com/material-ui/react-toggle-button/)
 *
 * API:
 *
 * - [ToggleButtonGroup API](https://mui.com/material-ui/api/toggle-button-group/)
 */
@JsName("default")
external val ToggleButtonGroup: react.FC<ToggleButtonGroupProps>
