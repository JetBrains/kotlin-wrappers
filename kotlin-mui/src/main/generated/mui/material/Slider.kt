// Automatically generated - do not modify!

@file:JsModule("@mui/material/Slider")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface SliderProps :
    mui.base.SliderUnstyledProps,
    mui.system.PropsWithSx {
    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
     * @default 'primary'
     */
    var color: SliderColor?

    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: dynamic

    /**
     * The size of the slider.
     * @default 'medium'
     */
    var size: BaseSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Slider](https://mui.com/material-ui/react-slider/)
 *
 * API:
 *
 * - [Slider API](https://mui.com/material-ui/api/slider/)
 * - inherits [SliderUnstyled API](https://mui.com/base/api/slider-unstyled/)
 */
@JsName("default")
external val Slider: react.FC<SliderProps>
