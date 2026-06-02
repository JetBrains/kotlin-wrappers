// Automatically generated - do not modify!

@file:JsModule("@mui/material/SpeedDial")

package mui.material

import mui.material.styles.Theme
import mui.material.transitions.TransitionProps
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.*
import react.dom.events.SyntheticEvent
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement
import web.html.Hidden

external interface SpeedDialProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithChildren,
    PropsWithSx {
    /**
     * SpeedDialActions to display when the SpeedDial is `open`.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SpeedDialClasses?

    /**
     * The aria-label of the button element.
     * Also used to provide the `id` for the `SpeedDial` element and its children.
     */
    /* override var ariaLabel: String */

    /**
     * The direction the actions open relative to the floating action button.
     * @default 'up'
     */
    var direction: SpeedDialDirection?

    /**
     * If `true`, the SpeedDial is hidden.
     * @default false
     */
    override var hidden: Hidden?

    /**
     * Props applied to the [`Fab`](https://mui.com/material-ui/api/fab/) element.
     * @default {}
     */
    var FabProps: FabProps?

    /**
     * The icon to display in the SpeedDial Fab. The `SpeedDialIcon` component
     * provides a default Icon with animation.
     */
    var icon: ReactNode?

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"toggle"`, `"blur"`, `"mouseLeave"`, `"escapeKeyDown"`.
     */
    var onClose: ((event: SyntheticEvent<*, *>, reason: CloseReason) -> Unit)?

    /**
     * Callback fired when the component requests to be open.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"toggle"`, `"focus"`, `"mouseEnter"`.
     */
    var onOpen: ((event: SyntheticEvent<*, *>, reason: OpenReason) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean?

    /**
     * The icon to display in the SpeedDial Fab when the SpeedDial is open.
     */
    var openIcon: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The component used for the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Zoom
     * * @deprecated Use `slots.transition` instead. This prop will be removed in v7. [How to migrate](/material-ui/migration/migrating-from-deprecated-apis/)
     */
    var TransitionComponent: ComponentType<TransitionProps>?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     * @default {
     *   enter: theme.transitions.duration.enteringScreen,
     *   exit: theme.transitions.duration.leavingScreen,
     * }
     */
    var transitionDuration: Any? /* TransitionProps['timeout'] */

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](https://reactcommunity.org/react-transition-group/transition/) component.
     * @deprecated Use `slotProps.transition` instead. This prop will be removed in v7. [How to migrate](/material-ui/migration/migrating-from-deprecated-apis/)
     */
    var TransitionProps: TransitionProps?
}

external interface SpeedDialSlots {
    /**
     * The component that renders the root slot.
     * @default 'div'
     */
    var root: ElementType<*>

    /**
     * The component that renders the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Zoom
     */
    var transition: ElementType<*>
}

external interface SpeedDialOwnerState

/**
 *
 * Demos:
 *
 * - [Speed Dial](https://v6.mui.com/material-ui/react-speed-dial/)
 *
 * API:
 *
 * - [SpeedDial API](https://v6.mui.com/material-ui/api/speed-dial/)
 */
@JsName("default")
external val SpeedDial: FC<SpeedDialProps>
