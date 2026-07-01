// Automatically generated - do not modify!

@file:JsModule("@mui/material/Grow")

package mui.material

import mui.material.transitions.TransitionProps
import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface GrowProps :
    TransitionProps,
    PropsWithChildren {
    /**
     * Add a custom transition end trigger.
     * Use it when you need custom logic to decide when the transition has ended.
     * Note: Timeouts are still used as a fallback if provided.
     *
     * @param {HTMLElement} node The transitioning DOM node.
     * @param {Function} done Call this when the transition has finished.
     */
    var addEndListener: Any? /* TransitionProps['addEndListener'] */

    /**
     * Perform the enter transition when it first mounts if `in` is also `true`.
     * Set this to `false` to disable this behavior.
     * @default true
     */
    var appear: Boolean?

    /**
     * A single child content element.
     */
    override var children: ReactNode? /* React.ReactElement<unknown, any> */

    /**
     * If `true`, the transition ignores `theme.motion.reducedMotion` and keeps its normal timing.
     * @default false
     */
    var disablePrefersReducedMotion: Boolean?

    /**
     * The transition timing function.
     * You may specify a single easing or a object containing enter and exit values.
     */
    var easing: Any? /* TransitionProps['easing'] */

    /**
     * If `true`, the component will transition in.
     */
    var `in`: Boolean?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     *
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default 'auto'
     */
    var timeout: Any? /* TransitionProps['timeout'] | 'auto' */
}

/**
 * The Grow transition is used by the [Tooltip](https://mui.com/material-ui/react-tooltip/) and
 * [Popover](https://mui.com/material-ui/react-popover/) components.
 *
 * Demos:
 *
 * - [Popover](https://mui.com/material-ui/react-popover/)
 * - [Transitions](https://mui.com/material-ui/transitions/)
 *
 * API:
 *
 * - [Grow API](https://mui.com/material-ui/api/grow/)
 * - inherits [Transition API](https://reactcommunity.org/react-transition-group/transition/#Transition-props)
 */
@JsName("default")
external val Grow: FC<GrowProps>
