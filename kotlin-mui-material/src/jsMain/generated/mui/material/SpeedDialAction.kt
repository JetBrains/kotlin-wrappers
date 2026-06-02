// Automatically generated - do not modify!

@file:JsModule("@mui/material/SpeedDialAction")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.ElementType
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface SpeedDialActionProps :
    StandardProps,
    TooltipProps,
    PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SpeedDialActionClasses?

    /**
     * Props applied to the [`Fab`](https://mui.com/material-ui/api/fab/) component.
     * @default {}
     * @deprecated Use `slotProps.fab` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
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
    var icon: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * `classes` prop applied to the [`Tooltip`](https://mui.com/material-ui/api/tooltip/) element.
     * @deprecated Use `slotProps.tooltip.classes` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var TooltipClasses: TooltipClasses?

    /**
     * Placement of the tooltip.
     * @default 'left'
     * @deprecated Use `slotProps.tooltip.placement` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var tooltipPlacement: TooltipPlacement?

    /**
     * Label to display in the tooltip.
     * @deprecated Use `slotProps.tooltip.title` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var tooltipTitle: ReactNode?

    /**
     * Make the tooltip always visible when the SpeedDial is open.
     * @default false
     * @deprecated Use `slotProps.tooltip.open` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var tooltipOpen: Boolean?
}

external interface SpeedDialActionSlots {
    /**
     * The component that renders the fab.
     * @default Fab
     */
    var fab: ElementType<*>?

    /**
     * The component that renders the tooltip.
     * @default Tooltip
     */
    var tooltip: ElementType<*>?

    /**
     * The component that renders the static tooltip.
     * @default 'span'
     */
    var staticTooltip: ElementType<*>?

    /**
     * The component that renders the static tooltip label.
     * @default 'span'
     */
    var staticTooltipLabel: ElementType<*>?
}

external interface SpeedDialActionSlotProps : Props {
    /** TS: SlotProps< React.ElementType<FabProps>, SpeedDialActionFabSlotPropsOverrides, SpeedDialActionOwnerState > */
    var fab: FabProps?

    /** TS: SlotProps< React.ElementType<TooltipProps>, SpeedDialActionTooltipSlotPropsOverrides, SpeedDialActionOwnerState > */
    var tooltip: TooltipProps?

    /** TS: SlotProps< 'span', SpeedDialActionStaticTooltipSlotPropsOverrides, SpeedDialActionOwnerState > */
    var staticTooltip: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps< 'span', SpeedDialActionStaticTooltipLabelSlotPropsOverrides, SpeedDialActionOwnerState > */
    var staticTooltipLabel: HTMLAttributes<HTMLSpanElement>?
}

external interface SpeedDialActionSlotsAndSlotProps : Props {
    var slots: SpeedDialActionSlots?

    var slotProps: SpeedDialActionSlotProps?
}

external interface SpeedDialActionOwnerState

/**
 *
 * Demos:
 *
 * - [Speed Dial](https://v6.mui.com/material-ui/react-speed-dial/)
 *
 * API:
 *
 * - [SpeedDialAction API](https://v6.mui.com/material-ui/api/speed-dial-action/)
 * - inherits [Tooltip API](https://v6.mui.com/material-ui/api/tooltip/)
 */
@JsName("default")
external val SpeedDialAction: FC<SpeedDialActionProps>
