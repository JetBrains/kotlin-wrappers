// Automatically generated - do not modify!

@file:JsModule("@mui/material/Slider")
@file:JsNonModule

package mui.material

external interface SliderProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement> {
    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: mui.system.Union? /* 'primary' | 'secondary', SliderPropsColorOverrides */

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The size of the slider.
     * @default 'medium'
     */
    var size: mui.system.Union? /* 'small' | 'medium', SliderPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Slider](https://mui.com/components/slider/)
 *
 * API:
 *
 * - [Slider API](https://mui.com/api/slider/)
 * - inherits [SliderUnstyled API](https://mui.com/api/slider-unstyled/)
 */
@JsName("default")
external val Slider: react.FC<SliderProps>
