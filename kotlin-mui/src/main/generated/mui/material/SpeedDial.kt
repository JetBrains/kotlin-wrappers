// Automatically generated - do not modify!

@file:JsModule("@mui/material/SpeedDial")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface SpeedDialProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * SpeedDialActions to display when the SpeedDial is `open`.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SpeedDialClasses?

    /**
     * The aria-label of the button element.
     * Also used to provide the `id` for the `SpeedDial` element and its children.
     */
    var ariaLabel: String

    /**
     * The direction the actions open relative to the floating action button.
     * @default 'up'
     */
    var direction: SpeedDialDirection?

    /**
     * If `true`, the SpeedDial is hidden.
     * @default false
     */
    override var hidden: Boolean?

    /**
     * Props applied to the [`Fab`](/material-ui/api/fab/) element.
     * @default {}
     */
    var FabProps: FabProps?

    /**
     * The icon to display in the SpeedDial Fab. The `SpeedDialIcon` component
     * provides a default Icon with animation.
     */
    var icon: react.ReactNode?

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"toggle"`, `"blur"`, `"mouseLeave"`, `"escapeKeyDown"`.
     */
    var onClose: ((event: react.dom.events.SyntheticEvent<*, *>, reason: CloseReason) -> Unit)?

    /**
     * Callback fired when the component requests to be open.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"toggle"`, `"focus"`, `"mouseEnter"`.
     */
    var onOpen: ((event: react.dom.events.SyntheticEvent<*, *>, reason: OpenReason) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean?

    /**
     * The icon to display in the SpeedDial Fab when the SpeedDial is open.
     */
    var openIcon: react.ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The component used for the transition.
     * [Follow this guide](/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Zoom
     */
    var TransitionComponent: react.ComponentType<mui.material.transitions.TransitionProps>?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     * @default {
     *   enter: theme.transitions.duration.enteringScreen,
     *   exit: theme.transitions.duration.leavingScreen,
     * }
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] */

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
 * - [Speed dial](https://mui.com/material-ui/react-speed-dial/)
 *
 * API:
 *
 * - [SpeedDial API](https://mui.com/material-ui/api/speed-dial/)
 */
@JsName("default")
external val SpeedDial: react.FC<SpeedDialProps>
