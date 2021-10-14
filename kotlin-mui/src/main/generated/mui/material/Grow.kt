// Automatically generated - do not modify!

@file:JsModule("@mui/material/Grow")
@file:JsNonModule

package mui.material

external interface GrowProps : mui.material.transitions.TransitionProps {
    /**
     * Perform the enter transition when it first mounts if `in` is also `true`.
     * Set this to `false` to disable this behavior.
     * @default true
     */
    var appear: Boolean

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
    var `in`: Boolean

    var ref: react.Ref<*>

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
 * The Grow transition is used by the [Tooltip](https://mui.com/components/tooltips/) and
 * [Popover](https://mui.com/components/popover/) components.
 * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
 *
 * Demos:
 *
 * - [Popover](https://mui.com/components/popover/)
 * - [Transitions](https://mui.com/components/transitions/)
 *
 * API:
 *
 * - [Grow API](https://mui.com/api/grow/)
 * - inherits [Transition API](https://reactcommunity.org/react-transition-group/transition#Transition-props)
 */
@JsName("default")
external val Grow: react.FC<GrowProps>
