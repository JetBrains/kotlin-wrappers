// Automatically generated - do not modify!

@file:JsModule("@mui/material/Slide")

package mui.material

import mui.material.transitions.TransitionProps
import react.FC
import react.PropsWithChildren
import react.ReactNode
import web.dom.Element

external interface SlideProps :
    TransitionProps,
    PropsWithChildren {
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
     * An HTML element, or a function that returns one.
     * It's used to set the container the Slide is transitioning from.
     */
    var container: Element? /* null | Element | ((element: Element) => Element) */

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
    var easing: Any? /* TransitionProps['easing'] */

    /**
     * If `true`, the component will transition in.
     */
    var `in`: Any? /* TransitionProps['in'] */

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
 * The Slide transition is used by the [Drawer](https://v6.mui.com/material-ui/react-drawer/) component.
 * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
 *
 * Demos:
 *
 * - [Dialog](https://v6.mui.com/material-ui/react-dialog/)
 * - [Transitions](https://v6.mui.com/material-ui/transitions/)
 *
 * API:
 *
 * - [Slide API](https://v6.mui.com/material-ui/api/slide/)
 * - inherits [Transition API](https://reactcommunity.org/react-transition-group/transition/#Transition-props)
 */
@JsName("default")
external val Slide: FC<SlideProps>
