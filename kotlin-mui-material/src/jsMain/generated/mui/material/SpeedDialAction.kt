// Automatically generated - do not modify!

@file:JsModule("@mui/material/SpeedDialAction")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface SpeedDialActionProps :
    mui.system.StandardProps,
    TooltipProps,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SpeedDialActionClasses?

    /**
     * Props applied to the [`Fab`](/material-ui/api/fab/) component.
     * @default {}
     */
    var FabProps: FabProps?

    /**
     * Adds a transition delay, to allow a series of SpeedDialActions to be animated.
     * @default 0
     */
    var delay: Number?

    /**
     * The icon to display in the SpeedDial Fab.
     */
    var icon: react.ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * `classes` prop applied to the [`Tooltip`](/material-ui/api/tooltip/) element.
     */
    var TooltipClasses: TooltipClasses?

    /**
     * Placement of the tooltip.
     * @default 'left'
     */
    var tooltipPlacement: TooltipPlacement?

    /**
     * Label to display in the tooltip.
     */
    var tooltipTitle: react.ReactNode?

    /**
     * Make the tooltip always visible when the SpeedDial is open.
     * @default false
     */
    var tooltipOpen: Boolean?
}

/**
 *
 * Demos:
 *
 * - [Speed Dial](https://mui.com/material-ui/react-speed-dial/)
 *
 * API:
 *
 * - [SpeedDialAction API](https://mui.com/material-ui/api/speed-dial-action/)
 * - inherits [Tooltip API](https://mui.com/material-ui/api/tooltip/)
 */
@JsName("default")
external val SpeedDialAction: react.FC<SpeedDialActionProps>
