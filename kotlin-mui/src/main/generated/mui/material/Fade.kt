// Automatically generated - do not modify!

@file:JsModule("@mui/material/Fade")
@file:JsNonModule

package mui.material

external interface FadeProps :
    mui.material.transitions.TransitionProps {
    /**
     * Perform the enter transition when it first mounts if `in` is also `true`.
     * Set this to `false` to disable this behavior.
     * @default true
     */
    var appear: Boolean?

    /**
     * A single child content element.
     */
    var children: react.ReactElement

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
 * The Fade transition is used by the [Modal](https://mui.com/components/modal/) component.
 * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
 *
 * Demos:
 *
 * - [Transitions](https://mui.com/components/transitions/)
 *
 * API:
 *
 * - [Fade API](https://mui.com/api/fade/)
 * - inherits [Transition API](http://reactcommunity.org/react-transition-group/transition/#Transition-props)
 */
@JsName("default")
external val Fade: react.FC<FadeProps>
