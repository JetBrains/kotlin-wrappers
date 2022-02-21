// Automatically generated - do not modify!

@file:JsModule("@mui/material/Slide")
@file:JsNonModule

package mui.material

external interface SlideProps :
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
     * An HTML element, or a function that returns one.
     * It's used to set the container the Slide is transitioning from.
     */
    var container: ((element: org.w3c.dom.Element) -> org.w3c.dom.Element)?

    /**
     * Direction the child node will enter from.
     * @default 'down'
     */
    var direction: SlideDirection?

    /**
     * The transition timing function.
     * You may specify a single easing or a object containing enter and exit values.
     * @default {
     *   enter: theme.transitions.easing.easeOut,
     *   exit: theme.transitions.easing.sharp,
     * }
     */
    var easing: dynamic /* TransitionProps['easing'] */

    /**
     * If `true`, the component will transition in.
     */
    var `in`: dynamic /* TransitionProps['in'] */

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
 * The Slide transition is used by the [Drawer](https://mui.com/components/drawers/) component.
 * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
 *
 * Demos:
 *
 * - [Dialogs](https://mui.com/components/dialogs/)
 * - [Transitions](https://mui.com/components/transitions/)
 *
 * API:
 *
 * - [Slide API](https://mui.com/api/slide/)
 * - inherits [Transition API](http://reactcommunity.org/react-transition-group/transition/#Transition-props)
 */
@JsName("default")
external val Slide: react.FC<SlideProps>
