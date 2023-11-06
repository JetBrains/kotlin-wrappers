// Automatically generated - do not modify!

@file:JsModule("@mui/material/Grow")

package mui.material

external interface GrowProps :
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
     *
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default 'auto'
     */
    var timeout: dynamic /* TransitionProps['timeout'] | 'auto' */
}

/**
 * The Grow transition is used by the [Tooltip](https://mui.com/material-ui/react-tooltip/) and
 * [Popover](https://mui.com/material-ui/react-popover/) components.
 * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
 *
 * Demos:
 *
 * - [Popover](https://mui.com/material-ui/react-popover/)
 * - [Transitions](https://mui.com/material-ui/transitions/)
 *
 * API:
 *
 * - [Grow API](https://mui.com/material-ui/api/grow/)
 * - inherits [Transition API](http://reactcommunity.org/react-transition-group/transition/#Transition-props)
 */
@JsName("default")
external val Grow: react.FC<GrowProps>
