// Automatically generated - do not modify!

@file:JsModule("@mui/material/Snackbar")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface SnackbarProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement> {
    /**
     * The action to display. It renders after the message, at the end of the snackbar.
     */
    var action: react.ReactNode?

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
    var children: react.ReactElement?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SnackbarClasses?

    /**
     * Props applied to the `ClickAwayListener` element.
     */
    var ClickAwayListenerProps: mui.base.ClickAwayListenerProps?

    /**
     * Props applied to the [`SnackbarContent`](/api/snackbar-content/) element.
     */
    var ContentProps: SnackbarContentProps?

    /**
     * If `true`, the `autoHideDuration` timer will expire even if the window is not focused.
     * @default false
     */
    var disableWindowBlurListener: Boolean?

    /**
     * When displaying multiple consecutive Snackbars from a parent rendering a single
     * <Snackbar/>, add the key prop to ensure independent treatment of each message.
     * e.g. <Snackbar key={message} />, otherwise, the message may update-in-place and
     * features such as autoHideDuration may be canceled.
     */
    var key: Any?

    /**
     * The message to display.
     */
    var message: react.ReactNode?

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
    var onClose: ((event: react.dom.events.SyntheticEvent<*, *>, reason: SnackbarCloseReason) -> Unit)?

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
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The component used for the transition.
     * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Grow
     */
    var TransitionComponent: react.ComponentType<*>?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     * @default {
     *   enter: duration.enteringScreen,
     *   exit: duration.leavingScreen,
     * }
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] */

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](https://reactcommunity.org/react-transition-group/transition) component.
     * @default {}
     */
    var TransitionProps: mui.material.transitions.TransitionProps?
}

external interface SnackbarOrigin {
    var vertical: mui.system.Union /* 'top' | 'bottom' */

    var horizontal: mui.system.Union /* 'left' | 'center' | 'right' */
}

/**
 *
 * Demos:
 *
 * - [Snackbars](https://mui.com/components/snackbars/)
 *
 * API:
 *
 * - [Snackbar API](https://mui.com/api/snackbar/)
 */
@JsName("default")
external val Snackbar: react.FC<SnackbarProps>
