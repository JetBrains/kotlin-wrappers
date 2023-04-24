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
     * The components used for each slot inside.
     *
     * This prop is an alias for the `slots` prop.
     * It's recommended to use the `slots` prop instead.
     *
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
        var Track: react.ElementType<*>?
        var Rail: react.ElementType<*>?
        var Thumb: react.ElementType<*>?
        var Mark: react.ElementType<*>?
        var MarkLabel: react.ElementType<*>?
        var ValueLabel: react.ElementType<*>?
        var Input: react.ElementType<*>?
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `slotProps` prop.
     * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
     *
     * @default {}
     */
    var componentsProps: mui.base.SliderUnstyledOwnProps.SlotProps?

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
