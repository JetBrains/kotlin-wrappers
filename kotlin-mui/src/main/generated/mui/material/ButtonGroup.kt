// Automatically generated - do not modify!

@file:JsModule("@mui/material/ButtonGroup")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ButtonGroupProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ButtonGroupClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: ButtonGroupColor?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, no elevation is used.
     * @default false
     */
    var disableElevation: Boolean?

    /**
     * If `true`, the button keyboard focus ripple is disabled.
     * @default false
     */
    var disableFocusRipple: Boolean?

    /**
     * If `true`, the button ripple effect is disabled.
     * @default false
     */
    var disableRipple: Boolean?

    /**
     * If `true`, the buttons will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean?

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: mui.material.Orientation?

    /**
     * The size of the component.
     * `small` is equivalent to the dense button styling.
     * @default 'medium'
     */
    var size: Size?

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: ButtonGroupVariant?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Button Group](https://mui.com/components/button-group/)
 *
 * API:
 *
 * - [ButtonGroup API](https://mui.com/api/button-group/)
 */
@JsName("default")
external val ButtonGroup: react.FC<ButtonGroupProps>
