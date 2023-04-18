// Automatically generated - do not modify!

package mui.base

external interface UseSnackbarParameters {
    /**
     * The number of milliseconds to wait before automatically calling the
     * `onClose` function. `onClose` should then set the state of the `open`
     * prop to hide the Snackbar. This behavior is disabled by default with
     * the `null` value.
     * @default null
     */
    var autoHideDuration: Number?

    /**
     * If `true`, the `autoHideDuration` timer will expire even if the window is not focused.
     * @default false
     */
    var disableWindowBlurListener: Boolean?

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
    var onClose: ((event: react.dom.events.SyntheticEvent<*, *>?, reason: SnackbarCloseReason) -> Unit)?

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
}

external interface UseSnackbarRootSlotOwnProps : react.Props {
    var onBlur: react.dom.events.FocusEventHandler<*>

    var onFocus: react.dom.events.FocusEventHandler<*>

    var onMouseEnter: react.dom.events.MouseEventHandler<*>

    var onMouseLeave: react.dom.events.MouseEventHandler<*>

    var role: react.dom.aria.AriaRole
}
