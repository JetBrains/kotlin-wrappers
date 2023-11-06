// Automatically generated - do not modify!

@file:JsModule("@mui/material/SpeedDialIcon")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface SpeedDialIconProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    mui.system.PropsWithSx {
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
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Speed Dial](https://mui.com/material-ui/react-speed-dial/)
 *
 * API:
 *
 * - [SpeedDialIcon API](https://mui.com/material-ui/api/speed-dial-icon/)
 */
@JsName("default")
external val SpeedDialIcon: react.FC<SpeedDialIconProps>
