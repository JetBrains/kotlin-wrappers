// Automatically generated - do not modify!

@file:JsModule("@mui/material/SpeedDialIcon")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface SpeedDialIconProps :
    StandardProps,
    HTMLAttributes<HTMLSpanElement>,
    PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SpeedDialIconClasses?

    /**
     * The icon to display.
     */
    var icon: ReactNode?

    /**
     * The icon to display in the SpeedDial Floating Action Button when the SpeedDial is open.
     */
    var openIcon: ReactNode?

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
 * - [Speed Dial](https://v6.mui.com/material-ui/react-speed-dial/)
 *
 * API:
 *
 * - [SpeedDialIcon API](https://v6.mui.com/material-ui/api/speed-dial-icon/)
 */
@JsName("default")
external val SpeedDialIcon: FC<SpeedDialIconProps>
