// Automatically generated - do not modify!

@file:JsModule("@mui/material/SpeedDialIcon")
@file:JsNonModule

package mui.material

external interface SpeedDialIconProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement> {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SpeedDialIconClasses?

    /**
     * The icon to display.
     */
    var icon: react.ReactNode?

    /**
     * The icon to display in the SpeedDial Floating Action Button when the SpeedDial is open.
     */
    var openIcon: react.ReactNode?

    /**
     * @ignore
     * If `true`, the component is shown.
     */
    var open: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Speed Dial](https://mui.com/components/speed-dial/)
 *
 * API:
 *
 * - [SpeedDialIcon API](https://mui.com/api/speed-dial-icon/)
 */
@JsName("default")
external val SpeedDialIcon: react.FC<SpeedDialIconProps>
