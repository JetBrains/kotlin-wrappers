// Automatically generated - do not modify!

@file:JsModule("@mui/material/Tooltip")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface TooltipProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * If `true`, adds an arrow to the tooltip.
     * @default false
     */
    var arrow: Boolean?

    /**
     * Tooltip reference element.
     */
    override var children: react.ReactNode? /* react.ReactElement<*>? */

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TooltipClasses?

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
        var Popper: react.ElementType<*>? /* React.ElementType<PopperProps> */
        var Transition: react.ElementType<*>?
        var Tooltip: react.ElementType<*>?
        var Arrow: react.ElementType<*>?
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
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var popper: react.Props? /* Partial<PopperProps> & TooltipComponentsPropsOverrides */
        var transition: react.Props? /* TransitionProps & TooltipComponentsPropsOverrides */
        var tooltip: react.Props? /* React.HTMLProps<HTMLDivElement> &
  MUIStyledCommonProps &
  TooltipComponentsPropsOverrides */
        var arrow: react.Props? /* React.HTMLProps<HTMLSpanElement> &
  MUIStyledCommonProps &
  TooltipComponentsPropsOverrides */
    }

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
    var enterDelay: Number?

    /**
     * The number of milliseconds to wait before showing the tooltip when one was already recently opened.
     * @default 0
     */
    var enterNextDelay: Number?

    /**
     * The number of milliseconds a user must touch the element before showing the tooltip.
     * @default 700
     */
    var enterTouchDelay: Number?

    /**
     * If `true`, the tooltip follow the cursor over the wrapped element.
     * @default false
     */
    var followCursor: Boolean?

    /**
     * This prop is used to help implement the accessibility logic.
     * If you don't provide this prop. It falls back to a randomly generated id.
     */
    var id: String?

    /**
     * The number of milliseconds to wait before hiding the tooltip.
     * This prop won't impact the leave touch delay (`leaveTouchDelay`).
     * @default 0
     */
    var leaveDelay: Number?

    /**
     * The number of milliseconds after the user stops touching an element before hiding the tooltip.
     * @default 1500
     */
    var leaveTouchDelay: Number?

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     */
    var onClose: ((event: react.dom.events.SyntheticEvent<*, *>) -> Unit)?

    /**
     * Callback fired when the component requests to be open.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     */
    var onOpen: ((event: react.dom.events.SyntheticEvent<*, *>) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean?

    /**
     * Tooltip placement.
     * @default 'bottom'
     */
    var placement: TooltipPlacement?

    /**
     * The component used for the popper.
     * @default Popper
     */
    var PopperComponent: react.ComponentType<PopperProps>?

    /**
     * Props applied to the [`Popper`](/material-ui/api/popper/) element.
     * @default {}
     */
    var PopperProps: PopperProps?

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `componentsProps` prop, which will be deprecated in the future.
     *
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var popper: react.Props? /* Partial<PopperProps> & TooltipComponentsPropsOverrides */
        var transition: react.Props? /* TransitionProps & TooltipComponentsPropsOverrides */
        var tooltip: react.Props? /* React.HTMLProps<HTMLDivElement> &
  MUIStyledCommonProps<Theme> &
  TooltipComponentsPropsOverrides */
        var arrow: react.Props? /* React.HTMLProps<HTMLSpanElement> &
  MUIStyledCommonProps<Theme> &
  TooltipComponentsPropsOverrides */
    }

    /**
     * The components used for each slot inside.
     *
     * This prop is an alias for the `components` prop, which will be deprecated in the future.
     *
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var popper: react.ElementType<*>? /* React.ElementType<PopperProps> */
        var transition: react.ElementType<*>?
        var tooltip: react.ElementType<*>?
        var arrow: react.ElementType<*>?
    }

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Tooltip title. Zero-length titles string, undefined, null and false are never displayed.
     */
    var title: react.ReactNode

    /**
     * The component used for the transition.
     * [Follow this guide](/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Grow
     */
    var TransitionComponent: react.ComponentType<*>?

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](https://reactcommunity.org/react-transition-group/transition/) component.
     */
    var TransitionProps: mui.material.transitions.TransitionProps?
}

/**
 *
 * Demos:
 *
 * - [Tooltip](https://mui.com/material-ui/react-tooltip/)
 *
 * API:
 *
 * - [Tooltip API](https://mui.com/material-ui/api/tooltip/)
 */
@JsName("default")
external val Tooltip: react.FC<TooltipProps>
