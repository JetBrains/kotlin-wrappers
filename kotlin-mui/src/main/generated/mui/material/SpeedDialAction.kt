// Automatically generated - do not modify!

@file:JsModule("@mui/material/SpeedDialAction")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface SpeedDialActionProps :
    mui.system.StandardProps,
    TooltipProps {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SpeedDialActionClasses?

    /**
     * Props applied to the [`Fab`](/api/fab/) component.
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
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * `classes` prop applied to the [`Tooltip`](/api/tooltip/) element.
     */
    var TooltipClasses: dynamic /* TooltipProps['classes'] */

    /**
     * Placement of the tooltip.
     * @default 'left'
     */
    var tooltipPlacement: dynamic /* TooltipProps['placement'] */

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
 * - [Speed Dial](https://mui.com/components/speed-dial/)
 *
 * API:
 *
 * - [SpeedDialAction API](https://mui.com/api/speed-dial-action/)
 * - inherits [Tooltip API](https://mui.com/api/tooltip/)
 */
@JsName("default")
external val SpeedDialAction: react.FC<SpeedDialActionProps>
