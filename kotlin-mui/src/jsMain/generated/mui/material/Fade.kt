// Automatically generated - do not modify!

@file:JsModule("@mui/material/Fade")

package mui.material

external interface FadeProps :
    mui.material.transitions.TransitionProps,
    react.PropsWithChildren {
    /**
     * Perform the enter transition when it first mounts if `in` is also `true`.
     * Set this to `false` to disable this behavior.
     * @default true
     */
    var appear: Boolean?

    /**
     * A single child content element.
     */
    override var children: react.ReactNode? /* react.ReactElement<*>? */

    /**
     * The transition timing function.
     * You may specify a single easing or a object containing enter and exit values.
     */
    var easing: dynamic /* TransitionProps['easing'] */

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
    var timeout: dynamic /* TransitionProps['timeout'] */
}

/**
 * The Fade transition is used by the [Modal](https://mui.com/material-ui/react-modal/) component.
 * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
 *
 * Demos:
 *
 * - [Transitions](https://mui.com/material-ui/transitions/)
 *
 * API:
 *
 * - [Fade API](https://mui.com/material-ui/api/fade/)
 * - inherits [Transition API](http://reactcommunity.org/react-transition-group/transition/#Transition-props)
 */
@JsName("default")
external val Fade: react.FC<FadeProps>
