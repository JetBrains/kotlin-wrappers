// Automatically generated - do not modify!

@file:JsModule("@mui/material/Zoom")

package mui.material

import mui.material.transitions.TransitionProps
import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface ZoomProps :
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
     * @default {
     *   enter: theme.transitions.duration.enteringScreen,
     *   exit: theme.transitions.duration.leavingScreen,
     * }
     */
    var timeout: Any? /* TransitionProps['timeout'] */
}

/**
 * The Zoom transition can be used for the floating variant of the
 * [Button](https://mui.com/material-ui/react-floating-action-button/#animation) component.
 *
 * Demos:
 *
 * - [Transitions](https://mui.com/material-ui/transitions/)
 *
 * API:
 *
 * - [Zoom API](https://mui.com/material-ui/api/zoom/)
 * - inherits [Transition API](https://reactcommunity.org/react-transition-group/transition/#Transition-props)
 */
@JsName("default")
external val Zoom: FC<ZoomProps>
