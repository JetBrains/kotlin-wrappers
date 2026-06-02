// Automatically generated - do not modify!

@file:JsModule("@mui/material/Snackbar")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.base.ClickAwayListenerProps
import mui.material.styles.Theme
import mui.material.transitions.TransitionProps
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.*
import react.dom.events.SyntheticEvent
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface SnackbarProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The action to display. It renders after the message, at the end of the snackbar.
     */
    var action: ReactNode?

    /**
     * The anchor of the `Snackbar`.
     * On smaller screens, the component grows to occupy all the available width,
     * the horizontal alignment is ignored.
     * @default { vertical: 'bottom', horizontal: 'left' }
     */
    var anchorOrigin: SnackbarOrigin?

    /**
     * The number of milliseconds to wait before automatically calling the
     * `onClose` function. `onClose` should then set the state of the `open`
     * prop to hide the Snackbar. This behavior is disabled by default with
     * the `null` value.
     * @default null
     */
    var autoHideDuration: Number?

    /**
     * Replace the `SnackbarContent` component.
     */
    override var children: ReactNode? /* React.ReactElement<unknown, any> */

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SnackbarClasses?

    /**
     * Props applied to the `ClickAwayListener` element.
     * @deprecated Use `slotProps.clickAwayListener` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var ClickAwayListenerProps: ClickAwayListenerProps?

    /**
     * Props applied to the [`SnackbarContent`](https://mui.com/material-ui/api/snackbar-content/) element.
     * @deprecated Use `slotProps.content` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var ContentProps: SnackbarContentProps?

    /**
     * If `true`, the `autoHideDuration` timer will expire even if the window is not focused.
     * @default false
     */
    var disableWindowBlurListener: Boolean?

    /**
     * When displaying multiple consecutive snackbars using a single parent-rendered
     * `<Snackbar/>`, add the `key` prop to ensure independent treatment of each message.
     * For instance, use `<Snackbar key={message} />`. Otherwise, messages might update
     * in place, and features like `autoHideDuration` could be affected.
     */
    var key: Any?

    /**
     * The message to display.
     */
    var message: ReactNode?

    /**
     * Callback fired when the component requests to be closed.
     * Typically `onClose` is used to set state in the parent component,
     * which is used to control the `Snackbar` `open` prop.
     * The `reason` parameter can optionally be used to control the response to `onClose`,
     * for example ignoring `clickaway`.
     *
     * @param {React.SyntheticEvent<any> | Event} event The event source of the callback.
     * @param {string} reason Can be: `"timeout"` (`autoHideDuration` expired), `"clickaway"`, or `"escapeKeyDown"`.
     */
    var onClose: ((event: SyntheticEvent<*, *>, reason: SnackbarCloseReason) -> Unit)?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean?

    /**
     * The number of milliseconds to wait before dismissing after user interaction.
     * If `autoHideDuration` prop isn't specified, it does nothing.
     * If `autoHideDuration` prop is specified but `resumeHideDuration` isn't,
     * we default to `autoHideDuration / 2` ms.
     */
    var resumeHideDuration: Number?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The component used for the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @deprecated Use `slots.transition` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     * @default Grow
     */
    var TransitionComponent: ComponentType<*>?

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
     * @deprecated Use `slotProps.transition` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     * @default {}
     */
    var TransitionProps: TransitionProps?
}

external interface SnackbarSlots {
    /**
     * The component that renders the root slot.
     * @default 'div'
     */
    var root: ElementType<*>

    /**
     * The component that renders the content slot.
     * @default SnackbarContent
     */
    var content: ElementType<*>

    /**
     * The component that renders the clickAwayListener slot.
     * @default ClickAwayListener
     */
    var clickAwayListener: ElementType<*>

    /**
     * The component that renders the transition.
     * [Follow this guide](/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Grow
     */
    var transition: ElementType<*>
}

external interface SnackbarSlotProps : Props {
    /** TS: SlotProps<'div', SnackbarRootSlotPropsOverrides, SnackbarOwnerState> */
    var root: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps< React.ElementType<SnackbarContentProps>, SnackbarContentSlotPropsOverrides, SnackbarOwnerState > */
    var content: SnackbarContentProps?

    /** TS: SlotComponentProps< typeof ClickAwayListener, SnackbarClickAwayListenerSlotPropsOverrides, SnackbarOwnerState > */
    var clickAwayListener: ClickAwayListenerProps?

    /** TS: SlotComponentProps< React.ElementType, TransitionProps & SnackbarTransitionSlotPropsOverrides, SnackbarOwnerState > */
    var transition: TransitionProps?
}

external interface SnackbarSlotsAndSlotProps : Props {
    var slots: SnackbarSlots?

    var slotProps: SnackbarSlotProps?
}

external interface SnackbarOrigin {
    var vertical: SnackbarOriginVertical

    var horizontal: SnackbarOriginHorizontal
}

external interface SnackbarOwnerState

/**
 *
 * Demos:
 *
 * - [Snackbar](https://v6.mui.com/material-ui/react-snackbar/)
 *
 * API:
 *
 * - [Snackbar API](https://v6.mui.com/material-ui/api/snackbar/)
 */
@JsName("default")
external val Snackbar: FC<SnackbarProps>
