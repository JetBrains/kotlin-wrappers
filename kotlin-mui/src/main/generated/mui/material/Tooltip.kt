// Automatically generated - do not modify!

@file:JsModule("@mui/material/Tooltip")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface TooltipProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement> {
    /**
     * If `true`, adds an arrow to the tooltip.
     * @default false
     */
    var arrow: Boolean?

    /**
     * Tooltip reference element.
     */
    var children: react.ReactElement<*>

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TooltipClasses?

    /**
     * The components used for each slot inside the Tooltip.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the Tooltip.
     * Note that `componentsProps.popper` prop values win over `PopperProps`
     * and `componentsProps.transition` prop values win over `TransitionProps` if both are applied.
     * @default {}
     */
    var componentsProps: dynamic

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
     * Props applied to the [`Popper`](/api/popper/) element.
     * @default {}
     */
    var PopperProps: PopperProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * Tooltip title. Zero-length titles string are never displayed.
     */
    var title: react.ReactNode

    /**
     * The component used for the transition.
     * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Grow
     */
    var TransitionComponent: react.ComponentType<*>?

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](http://reactcommunity.org/react-transition-group/transition/) component.
     */
    var TransitionProps: mui.material.transitions.TransitionProps?
}

/**
 *
 * Demos:
 *
 * - [Tooltips](https://mui.com/components/tooltips/)
 *
 * API:
 *
 * - [Tooltip API](https://mui.com/api/tooltip/)
 */
@JsName("default")
external val Tooltip: react.FC<TooltipProps>
