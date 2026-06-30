// Automatically generated - do not modify!

@file:JsModule("@mui/material/Tooltip")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.material.transitions.TransitionProps
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.*
import react.dom.events.SyntheticEvent
import react.dom.html.HTMLAttributes
import web.dom.ElementId
import web.html.HTMLDivElement
import web.html.HTMLSpanElement

external interface TooltipProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    TooltipSlotsAndSlotProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * If `true`, adds an arrow to the tooltip.
     * @default false
     */
    var arrow: Boolean?

    /**
     * Tooltip reference element.
     */
    override var children: ReactNode? /* React.ReactElement<unknown, any> */

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TooltipClasses?

    /**
     * Set to `true` if the `title` acts as an accessible description.
     * By default the `title` acts as an accessible label for the child.
     * @default false
     */
    var describeChild: Boolean?

    /**
     * Do not respond to focus-visible events.
     * @default false
     */
    var disableFocusListener: Boolean?

    /**
     * Do not respond to hover events.
     * @default false
     */
    var disableHoverListener: Boolean?

    /**
     * Makes a tooltip not interactive, i.e. it will close when the user
     * hovers over the tooltip before the `leaveDelay` is expired.
     * @default false
     */
    var disableInteractive: Boolean?

    /**
     * Do not respond to long press touch events.
     * @default false
     */
    var disableTouchListener: Boolean?

    /**
     * The number of milliseconds to wait before showing the tooltip.
     * This prop won't impact the enter touch delay (`enterTouchDelay`).
     * @default 100
     */
    var enterDelay: Int?

    /**
     * The number of milliseconds to wait before showing the tooltip when one was already recently opened.
     * @default 0
     */
    var enterNextDelay: Int?

    /**
     * The number of milliseconds a user must touch the element before showing the tooltip.
     * @default 700
     */
    var enterTouchDelay: Int?

    /**
     * If `true`, the tooltip follow the cursor over the wrapped element.
     * @default false
     */
    var followCursor: Boolean?

    /**
     * This prop is used to help implement the accessibility logic.
     * If you don't provide this prop. It falls back to a randomly generated id.
     */
    var id: ElementId?

    /**
     * The number of milliseconds to wait before hiding the tooltip.
     * This prop won't impact the leave touch delay (`leaveTouchDelay`).
     * @default 0
     */
    var leaveDelay: Int?

    /**
     * The number of milliseconds after the user stops touching an element before hiding the tooltip.
     * @default 1500
     */
    var leaveTouchDelay: Int?

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     */
    var onClose: ((event: SyntheticEvent<*, *>) -> Unit)?

    /**
     * Callback fired when the component requests to be open.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     */
    var onOpen: ((event: SyntheticEvent<*, *>) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean?

    /**
     * Tooltip placement.
     * @default 'bottom'
     */
    var placement: Any? /* PopperProps['placement'] */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Tooltip title. Zero-length titles string, undefined, null and false are never displayed.
     */
    var title: ReactNode
}

external interface TooltipSlots {
    /**
     * The component used for the popper.
     * @default Popper
     */
    var popper: ElementType<*>

    /**
     * The component used for the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Grow
     */
    var transition: ElementType<*>

    /**
     * The component used for the tooltip.
     */
    var tooltip: ElementType<*>

    /**
     * The component used for the arrow.
     */
    var arrow: ElementType<*>
}

external interface TooltipSlotProps : Props {
    /** TS: SlotProps<React.ElementType<PopperProps>, TooltipPopperSlotPropsOverrides, TooltipOwnerState> */
    var popper: PopperProps?

    /** TS: SlotProps<React.ElementType, TransitionProps & TooltipTransitionSlotPropsOverrides, TooltipOwnerState> */
    var transition: TransitionProps?

    /** TS: SlotProps<'div', TooltipTooltipSlotPropsOverrides, TooltipOwnerState> */
    var tooltip: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps<'span', TooltipArrowSlotPropsOverrides, TooltipOwnerState> */
    var arrow: HTMLAttributes<HTMLSpanElement>?
}

external interface TooltipSlotsAndSlotProps : Props {
    var slots: TooltipSlots?

    var slotProps: TooltipSlotProps?
}

external interface TooltipOwnerState

/**
 *
 * Demos:
 *
 * - [Tooltip](https://v7.mui.com/material-ui/react-tooltip/)
 *
 * API:
 *
 * - [Tooltip API](https://v7.mui.com/material-ui/api/tooltip/)
 */
@JsName("default")
external val Tooltip: FC<TooltipProps>
